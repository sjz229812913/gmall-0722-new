package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * spu图片
 * 
 * @author liangwenhao
 * @email lwh@atguigu.com
 * @date 2020-02-13 11:41:23
 */
@ApiModel
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(name = "spuId",value = "spu_id")
	private Long spuId;
	/**
	 * 图片名
	 */
	@ApiModelProperty(name = "imgName",value = "图片名")
	private String imgName;
	/**
	 * 图片地址
	 */
	@ApiModelProperty(name = "imgUrl",value = "图片地址")
	private String imgUrl;
	/**
	 * 顺序
	 */
	@ApiModelProperty(name = "imgSort",value = "顺序")
	private Integer imgSort;
	/**
	 * 是否默认图
	 */
	@ApiModelProperty(name = "defaultImg",value = "是否默认图")
	private Integer defaultImg;

}