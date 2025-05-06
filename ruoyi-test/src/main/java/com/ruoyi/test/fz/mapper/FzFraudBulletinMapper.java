package com.ruoyi.test.fz.mapper;

import java.util.List;
import com.ruoyi.test.fz.domain.FzFraudBulletin;

/**
 * QA问答Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
public interface FzFraudBulletinMapper 
{
    /**
     * 查询QA问答
     * 
     * @param id QA问答主键
     * @return QA问答
     */
    public FzFraudBulletin selectFzFraudBulletinById(Long id);

    /**
     * 查询QA问答列表
     * 
     * @param fzFraudBulletin QA问答
     * @return QA问答集合
     */
    public List<FzFraudBulletin> selectFzFraudBulletinList(FzFraudBulletin fzFraudBulletin);

    /**
     * 新增QA问答
     * 
     * @param fzFraudBulletin QA问答
     * @return 结果
     */
    public int insertFzFraudBulletin(FzFraudBulletin fzFraudBulletin);

    /**
     * 修改QA问答
     * 
     * @param fzFraudBulletin QA问答
     * @return 结果
     */
    public int updateFzFraudBulletin(FzFraudBulletin fzFraudBulletin);

    /**
     * 删除QA问答
     * 
     * @param id QA问答主键
     * @return 结果
     */
    public int deleteFzFraudBulletinById(Long id);

    /**
     * 批量删除QA问答
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFzFraudBulletinByIds(Long[] ids);
}
