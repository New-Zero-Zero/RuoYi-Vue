package com.ruoyi.test.fz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * QA问答对象 fz_fraud_bulletin
 * 
 * @author ruoyi
 * @date 2025-05-06
 */
public class FzFraudBulletin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 来源名称 */
    @Excel(name = "来源名称")
    private String source;

    /** 访问来源地址 */
    @Excel(name = "访问来源地址")
    private String url;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String image;

    /** Q问 */
    @Excel(name = "Q问")
    private String instruction;

    /** A答 */
    @Excel(name = "A答")
    private String output;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }

    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    public void setInstruction(String instruction) 
    {
        this.instruction = instruction;
    }

    public String getInstruction() 
    {
        return instruction;
    }

    public void setOutput(String output) 
    {
        this.output = output;
    }

    public String getOutput() 
    {
        return output;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("source", getSource())
            .append("url", getUrl())
            .append("image", getImage())
            .append("instruction", getInstruction())
            .append("output", getOutput())
            .append("createTime", getCreateTime())
            .toString();
    }
}
