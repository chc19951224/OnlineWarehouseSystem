<!-- ===== 视图 ===== -->
<template>
    <div>
        <!-- Container 布局容器(常见页面布局1) -->
        <el-container>

            <!-- Header(头部) -->
            <el-header>

                <!-- Layout 布局(分栏间隔) -->
                <el-row :gutter="20" style="margin-top: 20px;">
                    <!-- 分栏1 -->
                    <el-col :span="12">

                        <!-- Select 选择器(创建条目) -->
                        <el-select v-model="value" clearable placeholder="请选择分类进行查询" @change="getTableData"
                            style="width: 350px;">
                            <!-- 选择器列表 -->
                            <el-option v-for="item in options" :key="item.value" :label="item.label"
                                :value="item.value">
                            </el-option>
                        </el-select>

                    </el-col>

                    <!-- 分栏2 -->
                    <el-col :span="8">
                        <div class="grid-content bg-purple-light"></div>
                    </el-col>

                    <!-- 分栏3 -->
                    <el-col :span="4">
                        <div class="grid-content bg-purple-light"></div>
                    </el-col>
                </el-row>
            </el-header>

            <!-- Main(主体) -->
            <el-main>
                <!-- Table表格(固定表头、带边框表格、多选) -->
                <el-row>
                    <el-table :data="tableData" :row-class-name="tableColor" empty-text="暂无数据" border
                        style="width: 100%">
                        <el-table-column prop="id" label="序号" width="100" align="center"></el-table-column>

                        <el-table-column prop="編號" label="编号" width="150" align="center"></el-table-column>

                        <el-table-column prop="圖片" label="图片" width="200" align="center">
                            <template slot-scope="scope">
                                <img :src="scope.row.圖片" alt="图片" style="width: 50px; height: 50px;">
                            </template>
                        </el-table-column>

                        <el-table-column prop="顔色" label="颜色" width="150" align="center"></el-table-column>

                        <el-table-column prop="型號" label="型号" width="150" align="center"></el-table-column>

                        <el-table-column prop="起始年份" label="起始年份" width="100" align="center"></el-table-column>

                        <el-table-column prop="終止年份" label="终止年份" width="100" align="center"></el-table-column>

                        <el-table-column prop="平均價格" label="平均价格" width="150" align="center"></el-table-column>

                        <el-table-column label="操作" align="center">
                            <el-button type="primary" icon="el-icon-plus" align="center">添加到订单</el-button>
                        </el-table-column>
                    </el-table>
                </el-row>
            </el-main>

            <!-- Footer(页脚) -->
            <el-footer>
                <!-- Pagination分页(带有背景色的分页) -->
                <el-pagination :total="totalRecords" :page-size="pageRecords" @current-change="switchPage"
                    background layout="prev, pager, next" align="center">
                </el-pagination>
            </el-footer>

        </el-container>
    </div>
</template>

<!-- ===== 脚本 ===== -->
<script>
import { fetchBackendTable } from '@/api/component'  //导入接口的函数

export default {
    //数据
    data() {
        return {
            //==================== <el-select>选择器控件变量 ====================
            value: "",  // 选择的选项，默认为空

            // 选择器选项[ value:"变量名称", label:"显示名称" ]
            options: [
                { value: "bars_ladders_fences", label: "Bars, Ladders and Fences" },
                { value: "baseplates", label: "Baseplates" },
                { value: "belville_scala_fabuland", label: "Belville, Scala and Fabuland" },
                { value: "bricks", label: "Bricks" },
                { value: "bricks_curved", label: "Bricks Curved" },
                { value: "bricks_round_cones", label: "Bricks Round and Cones" },
                { value: "bricks_sloped", label: "Bricks Sloped" },
                { value: "bricks_special", label: "Bricks Special" },
                { value: "bricks_wedged", label: "Bricks Wedged" },
                { value: "clikits", label: "Clikits" },
                { value: "containers", label: "Containers" },
                { value: "duplo_quatro_primo", label: "Duplo, Quatro and Primo" },
                { value: "electronics", label: "Electronics" },
                { value: "energy_effects", label: "Energy Effects" },
                { value: "flags_signs_plastics_cloth", label: "Flags, Signs, Plastics and Cloth" },
                { value: "hinges_arms_turntables", label: "Hinges, Arms and Turntables" },
                { value: "ho_scale", label: "HO Scale" },
                { value: "large_buildable_figures", label: "Large Buildable Figures" },
                { value: "magnets_holders", label: "Magnets and Holders" },
                { value: "mechanical", label: "Mechanical" },
                { value: "minidoll_heads", label: "Minidoll Heads" },
                { value: "minidoll_lower_body", label: "Minidoll Lower Body" },
                { value: "minidoll_upper_body", label: "Minidoll Upper Body" },
                { value: "minifig_accessories", label: "Minifig Accessories" },
                { value: "minifig_heads", label: "Minifig Heads" },
                { value: "minifig_headwear", label: "Minifig Headwear" },
                { value: "minifig_lower_body", label: "Minifig Lower Body" },
                { value: "minifigs", label: "Minifigs" },
                { value: "minifig_upper_body", label: "Minifig Upper Body" },
                { value: "modulex", label: "Modulex" },
                { value: "non_buildable_figures", label: "Non-Buildable Figures (Duplo, Fabuland, etc)" },
                { value: "non_lego", label: "Non-LEGO" },
                { value: "panels", label: "Panels" },
                { value: "plants_animals", label: "Plants and Animals" },
                { value: "plates", label: "Plates" },
                { value: "plates_angled", label: "Plates Angled" },
                { value: "plates_round_curved_dishes", label: "Plates Round Curved and Dishes" },
                { value: "plates_special", label: "Plates Special" },
                { value: "pneumatics", label: "Pneumatics" },
                { value: "projectiles_launchers", label: "Projectiles / Launchers" },
                { value: "rock", label: "Rock" },
                { value: "stickers", label: "Stickers" },
                { value: "string_bands_reels", label: "String, Bands and Reels" },
                { value: "supports_girders_cranes", label: "Supports, Girders and Cranes" },
                { value: "technic_axles", label: "Technic Axles" },
                { value: "technic_beams", label: "Technic Beams" },
                { value: "technic_beams_special", label: "Technic Beams Special" },
                { value: "technic_bricks", label: "Technic Bricks" },
                { value: "technic_bushes", label: "Technic Bushes" },
                { value: "technic_connectors", label: "Technic Connectors" },
                { value: "technic_gears", label: "Technic Gears" },
                { value: "technic_panels", label: "Technic Panels" },
                { value: "technic_pins", label: "Technic Pins" },
                { value: "technic_special", label: "Technic Special" },
                { value: "technic_steering_suspension_engine", label: "Technic Steering, Suspension and Engine" },
                { value: "tiles", label: "Tiles" },
                { value: "tiles_round_curved", label: "Tiles Round and Curved" },
                { value: "tiles_special", label: "Tiles Special" },
                { value: "tools", label: "Tools" },
                { value: "transportation_land", label: "Transportation - Land" },
                { value: "transportation_sea_air", label: "Transportation - Sea and Air" },
                { value: "tubes_hoses", label: "Tubes and Hoses" },
                { value: "wheels_tyres", label: "Wheels and Tyres" },
                { value: "windows_doors", label: "Windows and Doors" },
                { value: "windscreens_fuselage", label: "Windscreens and Fuselage" },
                { value: "znap", label: "Znap" },
            ],
            //==================== <el-pagination>分页控件变量 ====================
            totalRecords: 0,       // 总记录数
            pageRecords: 30,   // 每页显示条数
            pageNumber: 1,  // 当前页码

            //==================== <el-table>表格控件变量 ====================
            tableData: [],  //表格数据
        }
    },
    //钩子函数
    created() {
        this.getTableData()
    },
    //函数方法
    methods: {
        async getTableData() {
            try {
                if (!this.value) return;  //如果选择器没有选择，则不获取数据

                //后端响应数据 = 调用接口函数(传递参数)
                const response = await fetchBackendTable(this.pageNumber, this.pageRecords, this.value);

                this.tableData = response.data.BackendTableData;  //变量tableData = 后端响应数据中的"BackendTableData"
                this.totalRecords = response.data.BackendTotalRecords;  //变量totalRecords = 后端响应数据中的"BackendTotalRecords"
            } catch (error) {
                console.error("表格内容产生失败！", error);
            }
        },
        // 当用户切换页面时，触发此方法
        switchPage(fePageNumber) {
            this.pageNumber = fePageNumber;  // 更新当前页码
            this.getTableData();     // 重新获取数据
        },
        //表格颜色
        tableColor() {
            return 'light-yellow';
        }
    }
}
</script>

<!-- ===== 样式 ===== -->
<style>
/* 选择器样式 */
.el-select {
    border: 2px solid #d3fbfc;
    border-radius: 10px;
}

/* 表格样式 */
.el-table {
    border: 2px solid #d3fbfc;
    border-radius: 10px;
}

.el-table .light-yellow {
    background: #ddef80;
}
</style>