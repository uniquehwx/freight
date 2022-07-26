package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.VehicleService;
import com.bizcenter.freight.convertor.VehicleReqDtoConvertor;
import com.bizcenter.freight.convertor.VehicleResDtoConvertor;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import com.bizcenter.freight.dto.res.VehicleResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("vehicleAppService")
@Transactional(rollbackFor = Exception.class)
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleReqDtoConvertor vehicleReqDtoConvertor;

    @Autowired
    private VehicleResDtoConvertor vehicleResDtoConvertor;

//    private IPService<VehiclePo> vehiclePoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public VehicleServiceImpl(VehicleMapper vehicleMapper) {
//        this.vehiclePoService = new BasePService(vehicleMapper);
//    }



    @Override
    public VehicleResDto save(VehicleReqDto reqDto) {
//        VehiclePo po = vehicleReqDtoConvertor.dto2Po(reqDto);
//        vehiclePoService.save(po);
//        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return vehiclePoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<VehicleResDto> doPager(Map<String, Object> params) {
//        Pager<VehiclePo> poPager = vehiclePoService.queryPage(params, VehiclePo.class);
//        Pager<VehicleResDto> resDtoPager = vehicleResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public VehicleResDto selectOne(Long id) {
//        VehiclePo po = vehiclePoService.getById(id);
//        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public VehicleResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(VehiclePo::new, params);
//        queryWrapper.last(" limit 1");
//        VehiclePo po = vehiclePoService.getOne(queryWrapper);
//        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<VehiclePo> updateWrapper = QueryParamUtils.updateWrapper4Map(VehiclePo::new, id, params);
//        return vehiclePoService.update(new VehiclePo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, VehicleReqDto reqDto) {
//        VehiclePo po = vehicleReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return vehiclePoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, VehicleReqDto reqDto) {
//        UpdateWrapper<VehiclePo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = VehicleReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), VehicleReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return vehiclePoService.update(new VehiclePo(), updateWrapper);
        return  true;
    }

}