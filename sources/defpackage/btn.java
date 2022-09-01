package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: PG */
/* renamed from: btn  reason: default package */
/* loaded from: classes.dex */
public final class btn {
    public static btn a;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/chinese/ScTcConverter");
    public final dxs b = new dxs((byte[]) null, (byte[]) null);
    public final ewj c = new ewj((byte[]) null);

    public btn() {
        hln.a();
    }

    public static char[] a(int i) {
        InputStreamReader inputStreamReader;
        int length;
        char[] cArr;
        int i2;
        AssetFileDescriptor openRawResourceFd = guw.a().getResources().openRawResourceFd(i);
        try {
            inputStreamReader = new InputStreamReader(openRawResourceFd.createInputStream(), "utf-16");
            length = ((int) openRawResourceFd.getLength()) / 2;
            cArr = new char[length];
            i2 = 0;
            int read = inputStreamReader.read(cArr, 0, length);
            while (read != -1 && (i2 = i2 + read) != length) {
                read = inputStreamReader.read(cArr, i2, length - i2);
            }
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) d.c()).i(e)).k("com/google/android/apps/inputmethod/libs/chinese/ScTcConverter", "loadRules", '4', "ScTcConverter.java")).t("Failed to init converter!");
        }
        if (i2 == length) {
            inputStreamReader.close();
            return cArr;
        }
        inputStreamReader.close();
        return gvw.e;
    }

    public static short[] b(int i) {
        FileInputStream createInputStream;
        int length;
        byte[] bArr;
        AssetFileDescriptor openRawResourceFd = guw.a().getResources().openRawResourceFd(i);
        try {
            createInputStream = openRawResourceFd.createInputStream();
            length = (int) openRawResourceFd.getLength();
            bArr = new byte[length];
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) d.c()).i(e)).k("com/google/android/apps/inputmethod/libs/chinese/ScTcConverter", "loadIndex", 'R', "ScTcConverter.java")).t("Failed to init converter!");
        }
        if (createInputStream.read(bArr) == length) {
            int i2 = length >> 1;
            short[] sArr = new short[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 + i3;
                int i5 = bArr[i4];
                int i6 = bArr[i4 + 1];
                if (i5 < 0) {
                    i5 += 256;
                }
                if (i6 < 0) {
                    i6 += 256;
                }
                sArr[i3] = (short) ((i6 << 8) | i5);
            }
            if (createInputStream != null) {
                createInputStream.close();
            }
            return sArr;
        }
        if (createInputStream != null) {
            createInputStream.close();
        }
        return gvw.f;
    }
}
