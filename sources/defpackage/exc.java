package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: exc  reason: default package */
/* loaded from: classes.dex */
public final class exc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils");
    private static final long b = Duration.ofSeconds(5).toMillis();

    public static Uri a(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        String absolutePath3 = context.getCacheDir().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath2)) {
            return Uri.parse("appfiles:".concat(String.valueOf(absolutePath.substring(absolutePath2.length()))));
        }
        if (absolutePath.startsWith(absolutePath3)) {
            return Uri.parse("appcache:".concat(String.valueOf(absolutePath.substring(absolutePath3.length()))));
        }
        throw new IllegalArgumentException("File path must be path of app files or cache");
    }

    public static fwm b(Context context, String str, File file, File file2, File file3, evg evgVar, nnq nnqVar) {
        fwl a2 = fwm.a();
        a2.e(str);
        a2.a = str.hashCode();
        a2.d(a(context, file), a(context, file2), a(context, file3));
        a2.c = fyb.d(1, 0L);
        if (evgVar.a) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "createTrainerOptions", 155, "InAppTrainingUtils.java")).w("Using debug configuration for session %s.", str);
            a2.b = b;
        }
        if (nnqVar != null) {
            a2.b(nnqVar.q());
        }
        return a2.a();
    }

    public static llw c(File file) {
        float f;
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            oxu oxuVar = (oxu) nfm.x(oxu.d, fileInputStream, nfb.b());
            lls h = llw.h();
            int i2 = 0;
            while (true) {
                if (i2 >= oxuVar.c.size()) {
                    break;
                }
                String A = ((nem) oxuVar.c.get(i2)).A();
                int i3 = i2 + 1;
                if (i3 >= oxuVar.c.size()) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "parseTrainingMetrics", 195, "InAppTrainingUtils.java")).w("Missing serialized metric value for %s", A);
                    break;
                }
                nfb b2 = nfb.b();
                oxu oxuVar2 = oxu.d;
                ner l = ((nem) oxuVar.c.get(i3)).l();
                nfm nfmVar = (nfm) oxuVar2.N(4);
                try {
                    try {
                        nho b3 = nhh.a.b(nfmVar);
                        b3.h(nfmVar, nes.p(l), b2);
                        b3.f(nfmVar);
                        try {
                            l.z(0);
                            nfm.O(nfmVar);
                            oxu oxuVar3 = (oxu) nfmVar;
                            ByteBuffer order = ByteBuffer.wrap(oxuVar3.b.D()).order(ByteOrder.nativeOrder());
                            int v = ols.v(oxuVar3.a);
                            if (v == 0) {
                                v = 1;
                            }
                            int i4 = v - 2;
                            if (i4 == 1) {
                                f = order.getFloat();
                            } else if (i4 != 2) {
                                if (i4 == 3) {
                                    i = order.getInt();
                                } else if (i4 != 5) {
                                    if (i4 != 6) {
                                        if (i4 == 9) {
                                            f = (float) order.getLong();
                                        } else if (i4 != 10) {
                                            ltd ltdVar = (ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "parseTrainingMetrics", 226, "InAppTrainingUtils.java");
                                            int v2 = ols.v(oxuVar3.a);
                                            if (v2 == 0) {
                                                v2 = 1;
                                            }
                                            ltdVar.z("Unexpected data type (ID=%d) for metric %s", ols.u(v2), A);
                                            f = 0.0f;
                                        }
                                    }
                                    i = order.get();
                                } else {
                                    i = order.getShort();
                                }
                                f = i;
                            } else {
                                f = (float) order.getDouble();
                            }
                            h.a(A, Float.valueOf(f));
                            i2 += 2;
                        } catch (ngd e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        if (!(e2.getCause() instanceof ngd)) {
                            throw new ngd(e2);
                        }
                        throw ((ngd) e2.getCause());
                    } catch (nhz e3) {
                        throw e3.a();
                    }
                } catch (RuntimeException e4) {
                    if (!(e4.getCause() instanceof ngd)) {
                        throw e4;
                    }
                    throw ((ngd) e4.getCause());
                } catch (ngd e5) {
                    if (!e5.a) {
                        throw e5;
                    }
                    throw new ngd(e5);
                }
            }
            llw l2 = h.l();
            fileInputStream.close();
            return l2;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public static File d(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (lfd.e(scheme) || lfd.e(path)) {
            throw new IllegalArgumentException("Uri is not valid");
        }
        if ("appfiles".equals(scheme)) {
            return new File(context.getFilesDir(), path);
        }
        if ("appcache".equals(scheme)) {
            return new File(context.getCacheDir(), path);
        }
        throw new IllegalArgumentException("File path must be path of app files or cache");
    }

    public static void e(File file) {
        jan janVar = jan.b;
        if (!janVar.g(file) || janVar.e(file)) {
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "deleteOutputDirIfExists", 171, "InAppTrainingUtils.java")).t("Unable to delete output directory");
    }

    public static void f(nfh nfhVar, Map map) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((llw) map).entrySet().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (i < 200) {
                float floatValue = ((Float) entry.getValue()).floatValue();
                List k = lfy.c('/').a(2).k((String) entry.getKey());
                if (k.isEmpty()) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "addTrainingMetricToMetadata", 346, "InAppTrainingUtils.java")).t("Metric name is empty");
                } else {
                    if (k.size() == 1) {
                        str2 = (String) k.get(0);
                        str = "";
                    } else {
                        str = (String) k.get(0);
                        str2 = (String) k.get(1);
                    }
                    if (str2.length() > 30) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "addTrainingMetricToMetadata", 358, "InAppTrainingUtils.java")).E("Metric name '%s' exceeds length limit %d", str2, 30);
                    } else {
                        nfh t = mdb.d.t();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mdb mdbVar = (mdb) t.b;
                        str2.getClass();
                        int i2 = mdbVar.a | 1;
                        mdbVar.a = i2;
                        mdbVar.b = str2;
                        mdbVar.a = i2 | 4;
                        mdbVar.c = floatValue;
                        nfh nfhVar2 = (nfh) linkedHashMap.get(str);
                        if (nfhVar2 == null) {
                            nfhVar2 = mda.d.t();
                            if (nfhVar2.c) {
                                nfhVar2.cD();
                                nfhVar2.c = false;
                            }
                            mda mdaVar = (mda) nfhVar2.b;
                            str.getClass();
                            mdaVar.a |= 1;
                            mdaVar.b = str;
                            linkedHashMap.put(str, nfhVar2);
                        }
                        if (nfhVar2.c) {
                            nfhVar2.cD();
                            nfhVar2.c = false;
                        }
                        mda mdaVar2 = (mda) nfhVar2.b;
                        mdb mdbVar2 = (mdb) t.cz();
                        mda mdaVar3 = mda.d;
                        mdbVar2.getClass();
                        nga ngaVar = mdaVar2.c;
                        if (!ngaVar.c()) {
                            mdaVar2.c = nfm.H(ngaVar);
                        }
                        mdaVar2.c.add(mdbVar2);
                    }
                }
                i++;
            } else {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/InAppTrainingUtils", "setTrainingMetricsMetadata", 247, "InAppTrainingUtils.java")).u("Exceeded max number of metrics to log: %d", 200);
                break;
            }
        }
        for (nfh nfhVar3 : linkedHashMap.values()) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mdc mdcVar = (mdc) nfhVar.b;
            mda mdaVar4 = (mda) nfhVar3.cz();
            mdc mdcVar2 = mdc.e;
            mdaVar4.getClass();
            nga ngaVar2 = mdcVar.d;
            if (!ngaVar2.c()) {
                mdcVar.d = nfm.H(ngaVar2);
            }
            mdcVar.d.add(mdaVar4);
        }
    }
}
