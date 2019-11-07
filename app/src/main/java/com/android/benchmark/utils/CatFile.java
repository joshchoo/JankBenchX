package com.android.benchmark.utils;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.io.SuFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CatFile {
    public static List<String> read(String filePath) {
        List<String> output = new ArrayList<>();
        File myFile = SuFile.open(filePath);
        if (myFile.exists() && myFile.canRead()) {
            if (Shell.rootAccess()) {
                output = Shell.su("cat " + filePath).exec().getOut();
            } else {
                output = Shell.sh("cat " + filePath).exec().getOut();
            }
        }

        return output;
    }
}
