package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* renamed from: ams  reason: default package */
/* loaded from: classes.dex */
public final class ams {
    public static final Map a = new HashMap();
    private static final ouu b = ouu.i(80, 75, 3, 4);

    public static ane a(Context context, String str) {
        return b(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ane b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return e(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new ane((Throwable) e);
        }
    }

    public static ane c(InputStream inputStream, String str) {
        try {
            return l(arw.d(oix.e(ovb.f(inputStream))), str, true);
        } finally {
            ash.i(inputStream);
        }
    }

    public static ane d(Context context, int i, String str) {
        Boolean bool;
        try {
            out e = oix.e(ovb.f(context.getResources().openRawResource(i)));
            try {
                bool = Boolean.valueOf(e.h(b) == 0);
            } catch (Exception unused) {
                int i2 = asa.a;
                bool = false;
            }
            if (bool.booleanValue()) {
                return e(new ZipInputStream(e.k()), str);
            }
            return c(e.k(), str);
        } catch (Resources.NotFoundException e2) {
            return new ane((Throwable) e2);
        }
    }

    public static ane e(ZipInputStream zipInputStream, String str) {
        ane aneVar;
        amz amzVar;
        String[] split;
        try {
            HashMap hashMap = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        obj = l(arw.d(oix.e(ovb.f(zipInputStream))), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    aneVar = new ane((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((amp) obj).b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                amzVar = null;
                                break;
                            }
                            amzVar = (amz) it.next();
                            if (amzVar.d.equals(str2)) {
                                break;
                            }
                        }
                        if (amzVar != null) {
                            amzVar.e = ash.e((Bitmap) entry.getValue(), amzVar.a, amzVar.b);
                        }
                    }
                    Iterator it2 = ((amp) obj).b.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            if (((amz) entry2.getValue()).e == null) {
                                aneVar = new ane((Throwable) new IllegalStateException("There is no image for ".concat(((amz) entry2.getValue()).d)));
                                break;
                            }
                        } else {
                            if (str != null) {
                                apb.a.a(str, (amp) obj);
                            }
                            aneVar = new ane(obj);
                        }
                    }
                }
            } catch (IOException e) {
                aneVar = new ane((Throwable) e);
            }
            return aneVar;
        } finally {
            ash.i(zipInputStream);
        }
    }

    public static ang f(Context context, String str) {
        return g(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ang g(Context context, String str, String str2) {
        return m(str2, new dlu(context.getApplicationContext(), str, str2, 1));
    }

    public static ang h(Context context, int i, String str) {
        return m(str, new amr(new WeakReference(context), context.getApplicationContext(), i, str, 0));
    }

    public static ang i(Context context, String str) {
        return j(context, str, "url_".concat(str));
    }

    public static ang j(Context context, String str, String str2) {
        return m(str2, new amq(context, str, str2));
    }

    public static String k(Context context, int i) {
        String str = (context.getResources().getConfiguration().uiMode & 48) != 32 ? "_day_" : "_night_";
        return "rawRes" + str + i;
    }

    private static ane l(arw arwVar, String str, boolean z) {
        try {
            try {
                amp a2 = ari.a(arwVar);
                if (str != null) {
                    apb.a.a(str, a2);
                }
                ane aneVar = new ane(a2);
                if (z) {
                    ash.i(arwVar);
                }
                return aneVar;
            } catch (Exception e) {
                ane aneVar2 = new ane((Throwable) e);
                if (z) {
                    ash.i(arwVar);
                }
                return aneVar2;
            }
        } catch (Throwable th) {
            if (z) {
                ash.i(arwVar);
            }
            throw th;
        }
    }

    private static ang m(String str, Callable callable) {
        amp ampVar = str == null ? null : (amp) apb.a.b.b(str);
        if (ampVar != null) {
            return new ang(new aty(ampVar, 1));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (ang) map.get(str);
            }
        }
        ang angVar = new ang(callable);
        if (str != null) {
            angVar.e(new amk(str, 2));
            angVar.d(new amk(str, 3));
            a.put(str, angVar);
        }
        return angVar;
    }
}
