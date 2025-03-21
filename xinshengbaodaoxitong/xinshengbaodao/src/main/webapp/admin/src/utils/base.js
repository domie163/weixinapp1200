const base = {
    get() {
        return {
            url : "http://localhost:8080/xinshengbaodao/",
            name: "xinshengbaodao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xinshengbaodao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新生报到系统"
        } 
    }
}
export default base
