package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Pair;
import java.io.File;
import java.security.SecureRandom;
import java.util.List;

/* compiled from: PG */
/* renamed from: giw  reason: default package */
/* loaded from: classes.dex */
public final class giw {
    public static long a(long j) {
        return (j - SystemClock.elapsedRealtime()) + System.currentTimeMillis();
    }

    public static void b() {
        throw new gin();
    }

    public static final ghr c(ghn ghnVar) {
        return new ghr(new oir(), ghnVar, null, null, null, null);
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static final void e(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public static Bundle f(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String g() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        return currentTimeMillis + "-" + abs;
    }

    public static void h(Bundle bundle) {
        if (!((Boolean) fuv.d.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= ((Integer) fuv.c.a()).intValue()) {
            return;
        }
        String obj = fuv.c.a().toString();
        throw new IllegalStateException("Max allowed bundle size of " + obj + " exceeded, you are passing in a bundle of " + dataSize + " size.");
    }

    public static void i(ful fulVar) {
        if (((Boolean) fuv.d.a()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            fum.a(fulVar, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= ((Integer) fuv.c.a()).intValue()) {
                return;
            }
            String obj = fuv.c.a().toString();
            throw new IllegalStateException("Max allowed feedback options size of " + obj + " exceeded, you are passing in feedback options of " + dataSize + " size.");
        }
    }

    public static void j(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static boolean k(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                k(file2);
            }
        }
        return file.delete();
    }

    public static final gmi m(ghn ghnVar) {
        return new gmi(ghnVar);
    }
}
