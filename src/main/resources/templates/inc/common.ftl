<#--分页-->
<#macro paging pageData>
    <div style="text-align: center">
        <div id="laypage-main">

        </div>
        <script>
            layui.use('laypage', function () {
                var laypage = layui.laypage;

                //执行一个laypage实例
                laypage.render({
                    elem: 'laypage-main'
                    , count: ${pageData.total}
                    , curr: ${pageData.current}
                    , limit: ${pageData.size}
                    , jump: function (obj, first) {
                        console.log(obj.curr);  //得到当前页
                        console.log(obj.limit);  //得到每页显示的条数

                        // 首次不执行
                        if (!first) {
                            //do something
                            location.href = "?pn=" + obj.curr;
                        }
                    }
                });
            });
        </script>
    </div>
</#macro>
