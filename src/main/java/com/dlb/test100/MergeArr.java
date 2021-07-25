package com.dlb.test100;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并、分割数组
 */
public class MergeArr {
	static DecimalFormat df = new DecimalFormat("#.####");
	static float[] bigarrs = null;

	public static void main(String[] args) {
		Float[] arrs = { 1.5f, 1.6f, 1.7f, 1.3f, 1.6f, 1.8f, 1.5f, 1.4f, 1.7f, 1.5f, 1.6f, 1.4f, 2.9f, 3.9f, 4.7f, 6.6f,
				7.1f, 8.4f, 1.2f, 9.4f, 5.7f, 8.5f, 7.5f, 6.8f, 2.2f, 9.5f, 5.7f, 8.7f, 3.9f, 4.7f };
		
		int num = 18; //分成多少组数据
		int count = arrs.length%num > 0 ? num - (arrs.length%num) : 0;
		if(count > 0) {
			arrs = capacity(arrs,count); // 补零
		}
		Float[][] floss = spiltArrs(arrs, arrs.length/num);
		for(Float[] flos : floss) {
			System.out.print(Arrays.toString(flos) + "  平均值: ");
			System.out.println(avg(flos));
		}
	}
	
	

	// 数组扩容
	private static Float[] capacity(Float[] arrs,int count) {
		int before = arrs.length;
		arrs = Arrays.copyOf(arrs, arrs.length + count);
		int now = arrs.length;
		for(int i = before;i<now;i++) {
			arrs[i] = 0f;
		}
		return arrs;
	}
	
	// 数组求平均值
	private static Float avg(Float[] arrs) {
		Float sum = 0f;
		for (Float f : arrs) {
			sum += f;
		}
		return Float.valueOf(df.format(sum / arrs.length));
	}

	// 切割数组
	private static Float[][] spiltArrs(Float[] arrs, int subSize) {
		int count = arrs.length % subSize == 0 ? arrs.length / subSize : arrs.length / subSize + 1;

		List<List<Float>> subArrsList = new ArrayList<List<Float>>();

		for (int i = 0; i < count; i++) {
			int index = i * subSize;
			List<Float> list = new ArrayList<Float>();
			int j = 0;
			while (j < subSize && index < arrs.length) {
				list.add(arrs[index++]);
				j++;
			}
			subArrsList.add(list);
		}

		Float[][] subArr = new Float[subArrsList.size()][];

		for (int i = 0; i < subArrsList.size(); i++) {
			List<Float> subList = subArrsList.get(i);
			Float[] subArrItem = new Float[subList.size()];
			for (int j = 0; j < subList.size(); j++) {
				subArrItem[j] = subList.get(j).floatValue();
			}
			subArr[i] = subArrItem;
		}

		return subArr;
	}

}
