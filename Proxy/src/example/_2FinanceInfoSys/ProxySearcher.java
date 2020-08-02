package example._2FinanceInfoSys;

public class ProxySearcher implements Searcher {
	
	private RealSearcher searcher = new RealSearcher();
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String doSearch(String userId, String keyword) {
		// TODO Auto-generated method stub
		// ��������֤�ɹ�����ִ�в�ѯ
		if(this.validate(userId)) {
			// ��Ӵ����ʵ�������Ĳ�ѯ����
			String result = searcher.doSearch(userId, keyword);
			// ��¼��ѯ��־
			this.log(userId);
			// ���ز�ѯ���
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
