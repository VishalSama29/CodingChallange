package com.learn.coding.service;

import com.learn.coding.entity.NumberEntity;
import com.learn.coding.reposotiry.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class BinaryReversalService {

    @Autowired
    NumberRepository numberRepository;

    public String BinaryReversal(String str) {

        NumberEntity entity = new NumberEntity();

        int intString = Integer.parseInt(str);
        String bites = Integer.toBinaryString(intString);
        int intBites = Integer.parseInt(bites);
        DecimalFormat df = new DecimalFormat("00000000");
        String newString = df.format(intBites);
        entity.setValue(newString);
        numberRepository.save(entity);
        String reversedString = reverse(newString);
        int decimal = Integer.parseInt(reversedString, 2);
        System.out.println(decimal);
        return String.valueOf(decimal);
    }

    static String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}
