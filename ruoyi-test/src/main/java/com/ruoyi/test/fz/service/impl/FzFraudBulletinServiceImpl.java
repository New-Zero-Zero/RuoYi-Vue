package com.ruoyi.test.fz.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.fz.mapper.FzFraudBulletinMapper;
import com.ruoyi.test.fz.domain.FzFraudBulletin;
import com.ruoyi.test.fz.service.IFzFraudBulletinService;

/**
 * QA问答Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
@Service
public class FzFraudBulletinServiceImpl implements IFzFraudBulletinService 
{
    @Autowired
    private FzFraudBulletinMapper fzFraudBulletinMapper;

    /**
     * 查询QA问答
     * 
     * @param id QA问答主键
     * @return QA问答
     */
    @Override
    public FzFraudBulletin selectFzFraudBulletinById(Long id)
    {
        return fzFraudBulletinMapper.selectFzFraudBulletinById(id);
    }

    /**
     * 查询QA问答列表
     * 
     * @param fzFraudBulletin QA问答
     * @return QA问答
     */
    @Override
    public List<FzFraudBulletin> selectFzFraudBulletinList(FzFraudBulletin fzFraudBulletin)
    {
        return fzFraudBulletinMapper.selectFzFraudBulletinList(fzFraudBulletin);
    }

    /**
     * 新增QA问答
     * 
     * @param fzFraudBulletin QA问答
     * @return 结果
     */
    @Override
    public int insertFzFraudBulletin(FzFraudBulletin fzFraudBulletin)
    {
        fzFraudBulletin.setCreateTime(DateUtils.getNowDate());
        return fzFraudBulletinMapper.insertFzFraudBulletin(fzFraudBulletin);
    }

    /**
     * 修改QA问答
     * 
     * @param fzFraudBulletin QA问答
     * @return 结果
     */
    @Override
    public int updateFzFraudBulletin(FzFraudBulletin fzFraudBulletin)
    {
        return fzFraudBulletinMapper.updateFzFraudBulletin(fzFraudBulletin);
    }

    /**
     * 批量删除QA问答
     * 
     * @param ids 需要删除的QA问答主键
     * @return 结果
     */
    @Override
    public int deleteFzFraudBulletinByIds(Long[] ids)
    {
        return fzFraudBulletinMapper.deleteFzFraudBulletinByIds(ids);
    }

    /**
     * 删除QA问答信息
     * 
     * @param id QA问答主键
     * @return 结果
     */
    @Override
    public int deleteFzFraudBulletinById(Long id)
    {
        return fzFraudBulletinMapper.deleteFzFraudBulletinById(id);
    }
}
