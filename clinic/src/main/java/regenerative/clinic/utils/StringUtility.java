package regenerative.clinic.utils;

import org.springframework.stereotype.Service;

@Service
public class StringUtility {

	/**
	 * 日付変換するメソッド
	 * (例：YYYYMMDD → YYYY年)
	 *
	 * @param  strYear  変換前日付 YYYY-MM-DD	(例：2008-01-01)
	 * @return rtnYear  変換後年　 YYYY         (例：2008年)
	 */
	public String rtnNendo(String strYear) {

		String karaYmd = "    ";

		if (strYear == null) {
			return karaYmd;
		}

		strYear = strYear.replaceAll("-","");

		if (strYear == null || strYear.length() != 8) {
			return karaYmd;
		} else {

			// 年の処理
			String rtnYear = strYear.substring(0, 4);
			if ( rtnYear.equals( "1098" ) == true ){
				rtnYear = "*";
			}
			else if ( rtnYear.equals( "1099" ) == true ){
				rtnYear = "*";
			}
			else if ( rtnYear.equals( "1097" ) == true ){
				rtnYear = "*";
			}
			else if ( rtnYear.equals( "1096" ) == true ){
				rtnYear = " ";
			}
			else{
				rtnYear = rtnYear + "年";
			}
			return rtnYear;

		}
	}
}
