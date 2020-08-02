package example._2FinanceInfoSys;

public class ProxySearcher implements Searcher {
	
	private RealSearcher searcher = new RealSearcher();
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String doSearch(String userId, String keyword) {
		// TODO Auto-generated method stub
		// 如果身份验证成功，则执行查询
		if(this.validate(userId)) {
			// 掉哟个真实主题对象的查询方法
			String result = searcher.doSearch(userId, keyword);
			// 记录查询日志
			this.log(userId);
			// 返回查询结果
			return result;
		}
		else {
			return null;
		}
	}
	
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}
	
	public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}

}
