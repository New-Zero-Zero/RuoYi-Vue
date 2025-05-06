package com.ruoyi.test.fz.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.fz.domain.FzFraudBulletin;
import com.ruoyi.test.fz.service.IFzFraudBulletinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * QA问答Controller
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@RestController
@RequestMapping("/fz/qa")
public class FzFraudBulletinController extends BaseController
{
    @Autowired
    private IFzFraudBulletinService fzFraudBulletinService;

    /**
     * 查询QA问答列表
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:list')")
    @GetMapping("/list")
    public TableDataInfo list(FzFraudBulletin fzFraudBulletin)
    {
        startPage();
        List<FzFraudBulletin> list = fzFraudBulletinService.selectFzFraudBulletinList(fzFraudBulletin);
        return getDataTable(list);
    }

    /**
     * 导出QA问答列表
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:export')")
    @Log(title = "QA问答", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FzFraudBulletin fzFraudBulletin)
    {
        List<FzFraudBulletin> list = fzFraudBulletinService.selectFzFraudBulletinList(fzFraudBulletin);
        ExcelUtil<FzFraudBulletin> util = new ExcelUtil<FzFraudBulletin>(FzFraudBulletin.class);
        util.exportExcel(response, list, "QA问答数据");
    }

    /**
     * 获取QA问答详细信息
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fzFraudBulletinService.selectFzFraudBulletinById(id));
    }

    /**
     * 新增QA问答
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:add')")
    @Log(title = "QA问答", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FzFraudBulletin fzFraudBulletin)
    {
        return toAjax(fzFraudBulletinService.insertFzFraudBulletin(fzFraudBulletin));
    }

    /**
     * 修改QA问答
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:edit')")
    @Log(title = "QA问答", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FzFraudBulletin fzFraudBulletin)
    {
        return toAjax(fzFraudBulletinService.updateFzFraudBulletin(fzFraudBulletin));
    }

    /**
     * 删除QA问答
     */
    @PreAuthorize("@ss.hasPermi('fz:qa:remove')")
    @Log(title = "QA问答", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fzFraudBulletinService.deleteFzFraudBulletinByIds(ids));
    }
}
