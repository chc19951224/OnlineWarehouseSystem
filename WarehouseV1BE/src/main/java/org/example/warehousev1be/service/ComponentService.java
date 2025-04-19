package org.example.warehousev1be.service;

import org.example.warehousev1be.entity.Component;
import org.example.warehousev1be.mapper.ComponentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service  //@零件服务层
public class ComponentService {
    @Autowired
    private ComponentMapper componentMapper;

    public  Map<String, Object> tableService(String feTableName, int fePageNumber, int fePageRecords) {
        List<Component> beTableData;  //数据库查询结果
        int beTotalRecords;  //获取总记录数
        int offset = (fePageNumber - 1) * fePageRecords;  //计算分页

        switch (feTableName){
            case "bars_ladders_fences":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "baseplates":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "belville_scala_fabuland":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks_curved":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks_round_cones":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks_sloped":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks_special":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "bricks_wedged":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "clikits":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "containers":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "duplo_quatro_primo":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "electronics":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "energy_effects":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "flags_signs_plastics_cloth":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "hinges_arms_turntables":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "ho_scale":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "large_buildable_figures":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "magnets_holders":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "mechanical":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minidoll_heads":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minidoll_lower_body":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minidoll_upper_body":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifig_accessories":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifig_heads":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifig_headwear":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifig_lower_body":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifigs":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "minifig_upper_body":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "modulex":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "non_buildable_figures":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "non_lego":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "panels":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "plants_animals":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "plates":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "plates_angled":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "plates_round_curved_dishes":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "plates_special":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "pneumatics":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "projectiles_launchers":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "rock":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "stickers":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "string_bands_reels":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "supports_girders_cranes":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_axles":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_beams":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_beams_special":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_bricks":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_bushes":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_connectors":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_gears":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_panels":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_pins":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_special":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "technic_steering_suspension_engine":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "tiles":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "tiles_round_curved":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "tiles_special":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "tools":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "transportation_land":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "transportation_sea_air":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "tubes_hoses":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "wheels_tyres":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "windows_doors":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "windscreens_fuselage":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;
            case "znap":
                beTableData = componentMapper.queryTable(feTableName, fePageRecords, offset);
                beTotalRecords = componentMapper.tableItems(feTableName);
                break;

            default:
                throw new IllegalArgumentException("未知的分类"+feTableName);
        }

        // 返回前端的数据
        Map<String, Object> result = new HashMap<>();
        result.put("BackendTableData", beTableData);  // 数据列表
        result.put("BackendTotalRecords", beTotalRecords);  // 总记录数

        return result;
    }
}
