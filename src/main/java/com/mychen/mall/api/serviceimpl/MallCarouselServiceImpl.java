package com.mychen.mall.api.serviceimpl;

import com.mychen.mall.api.controller.vo.MallIndexCarouselVO;
import com.mychen.mall.api.entity.MallCarousel;
import com.mychen.mall.api.mapper.MallCarouselMapper;
import com.mychen.mall.api.service.MallCarouselService;
import com.mychen.mall.api.util.BaseBeanUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author user
 * @date 2021/4/25
 * @description MallCarouselServiceImpl
 */
@Service
public class MallCarouselServiceImpl  implements MallCarouselService {
    @Resource
    private MallCarouselMapper mallCarouselMapper;

    @Override
    public List<MallIndexCarouselVO> getCarouselsForIndex(int number) {
        List<MallIndexCarouselVO> list = new ArrayList<>(number);
        List<MallCarousel> carousels = mallCarouselMapper.findCarouselsByNum(number);
        if (!CollectionUtils.isEmpty(carousels)) {
            list = BaseBeanUtil.copyList(carousels, MallIndexCarouselVO.class);
        }
        return list;
    }
}