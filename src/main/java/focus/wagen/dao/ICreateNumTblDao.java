package focus.wagen.dao;

import focus.wagen.entity.CreateNumTbl;

public interface ICreateNumTblDao {
	CreateNumTbl getCreateNumTbl(Integer dealerId);
	void saveObject(CreateNumTbl objCreateNumTbl);
}
