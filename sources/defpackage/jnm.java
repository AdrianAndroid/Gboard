package defpackage;

import android.os.Build;
import android.os.Debug;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jnm  reason: default package */
/* loaded from: classes.dex */
public final class jnm implements jnt {
    private static final Pattern a = Pattern.compile("VmHWM:\\s+(\\d+) kB");

    @Override // defpackage.jnt
    public final lcv a() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/status")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    Matcher matcher = a.matcher(readLine);
                    if (matcher.find()) {
                        i = Integer.parseInt(matcher.group(1));
                        break;
                    }
                }
                bufferedReader.close();
            } catch (IOException | SecurityException unused) {
            }
        }
        return new lcv(memoryInfo.nativePss, memoryInfo.dalvikPss, i, (byte[]) null);
    }
}
