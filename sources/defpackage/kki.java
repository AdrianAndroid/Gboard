package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: kki  reason: default package */
/* loaded from: classes.dex */
public final class kki {
    public static volatile kki a;
    private static Thread b;
    private static volatile Handler c;

    public static SparseArray A(Parcel parcel, Parcelable.Creator creator) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(parcel.readInt(), creator.createFromParcel(parcel));
        }
        return sparseArray;
    }

    public static Enum B(Parcel parcel, Enum[] enumArr) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        return enumArr[readInt];
    }

    public static void C(Parcel parcel, Enum r1) {
        parcel.writeInt(r1 == null ? -1 : r1.ordinal());
    }

    public static void D(Parcel parcel, SparseArray sparseArray, int i, jbd jbdVar) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            jbdVar.a(parcel, sparseArray.valueAt(i2), i);
        }
    }

    public static boolean E(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Object[] F(Parcel parcel, Parcelable.Creator creator) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] newArray = creator.newArray(readInt);
        for (int i = 0; i < readInt; i++) {
            newArray[i] = creator.createFromParcel(parcel);
        }
        return newArray;
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(mhr.a("appfiles:/nebulae/lc", str, str2, "input"));
    }

    public static Uri I(String str, String str2) {
        return Uri.parse(mhr.a("appfiles:/nebulae/lc", str, str2, "plan.pb"));
    }

    public static File J(Context context, String str) {
        return ker.k(context, Uri.parse(mhr.a("appfiles:/nebulae/lc", str)));
    }

    public static final lwm K(jlv jlvVar, oiy oiyVar, oiy oiyVar2, oiy oiyVar3) {
        jkl jklVar = (jkl) oiyVar3.a();
        lfb lfbVar = jlvVar.h;
        Executor executor = (Executor) oiyVar2.a();
        jhy jhyVar = (jhy) oiyVar.a();
        return new lwm();
    }

    private static final String L(String str) {
        return new String(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(mko mkoVar) {
        mkoVar.d(new joq(mkoVar, 9), mjl.a);
    }

    public static final lfb b(Context context) {
        lfb lfbVar;
        lfb lfbVar2;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            Context a2 = gkm.a(context);
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                StrictMode.allowThreadDiskWrites();
                try {
                    File file = new File(a2.getDir("phenotype_hermetic", 0), "overrides.txt");
                    lfbVar = file.exists() ? lfb.g(file) : ldu.a;
                } catch (RuntimeException e) {
                    Log.e("HermeticFileOverrides", "no data dir", e);
                    lfbVar = ldu.a;
                }
                if (lfbVar.e()) {
                    File file2 = (File) lfbVar.a();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            qv qvVar = new qv();
                            HashMap hashMap = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                } else {
                                    String L = L(split[0]);
                                    String decode = Uri.decode(L(split[1]));
                                    String str3 = (String) hashMap.get(split[2]);
                                    if (str3 == null) {
                                        String L2 = L(split[2]);
                                        str3 = Uri.decode(L2);
                                        if (str3.length() < 1024 || str3 == L2) {
                                            hashMap.put(L2, str3);
                                        }
                                    }
                                    if (!qvVar.containsKey(L)) {
                                        qvVar.put(L, new qv());
                                    }
                                    ((qv) qvVar.get(L)).put(decode, str3);
                                }
                            }
                            String obj = file2.toString();
                            String packageName = a2.getPackageName();
                            Log.w("HermeticFileOverrides", "Parsed " + obj + " for Android package " + packageName);
                            jlt jltVar = new jlt(qvVar);
                            bufferedReader.close();
                            lfbVar2 = lfb.g(jltVar);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    lfbVar2 = ldu.a;
                }
                return lfbVar2;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return ldu.a;
    }

    public static Object c(kiz kizVar) {
        try {
            return kizVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return kizVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static File d(Context context) {
        return e(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File e(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static Handler f() {
        if (c == null) {
            c = new Handler(Looper.getMainLooper());
        }
        return c;
    }

    public static void g() {
        if (!l()) {
            return;
        }
        throw new koj("Must be called on a background thread");
    }

    public static void h() {
        if (l()) {
            return;
        }
        throw new koj("Must be called on the main thread");
    }

    public static void i(Runnable runnable, long j) {
        f().postDelayed(runnable, j);
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }

    public static void k(Runnable runnable) {
        f().removeCallbacks(runnable);
    }

    public static boolean l() {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == b;
    }

    @Deprecated
    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void n(JSONObject jSONObject, String str, CharSequence charSequence) {
        if (charSequence.length() != 0) {
            jSONObject.putOpt(str, charSequence);
        }
    }

    public static void o(JSONObject jSONObject, String str, Number number) {
        if (number.intValue() != 0) {
            jSONObject.putOpt(str, number);
        }
    }

    public static void p(JSONObject jSONObject, String str, Collection collection) {
        if (!collection.isEmpty()) {
            jSONObject.putOpt(str, new JSONArray(collection));
        }
    }

    public static void q(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2.length() != 0) {
            jSONObject.putOpt(str, jSONObject2);
        }
    }

    public static final jli r(jlr jlrVar, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, oiy oiyVar9, oiy oiyVar10, oiy oiyVar11, oiy oiyVar12, oiy oiyVar13) {
        return new jli(lba.c(jlrVar), (jlu) oiyVar2.a(), (jlk) oiyVar7.a(), (kcq) oiyVar5.a(), new jmi(lba.c(jlrVar), (lgb) oiyVar8.a(), (kcq) oiyVar5.a(), (jnc) oiyVar9.a(), (lfb) oiyVar10.a(), (jml) oiyVar11.a(), (Executor) oiyVar6.a(), (jhy) oiyVar4.a(), null, null, null), (lfb) oiyVar12.a(), (lfb) oiyVar10.a(), (lwm) oiyVar.a(), (jhy) oiyVar4.a(), (jkl) oiyVar13.a(), (lfb) oiyVar3.a(), (Executor) oiyVar6.a(), null, null, null, null);
    }

    public static final jkk s(jlr jlrVar, jlv jlvVar, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, oiy oiyVar9, oiy oiyVar10, oiy oiyVar11, oiy oiyVar12, oiy oiyVar13, oiy oiyVar14, oiy oiyVar15, oiy oiyVar16) {
        jlu jluVar = (jlu) oiyVar2.a();
        lfb lfbVar = (lfb) oiyVar15.a();
        K(jlvVar, oiyVar4, oiyVar6, oiyVar14);
        return new jkk(lba.c(jlrVar), (lwm) oiyVar.a(), (jkl) oiyVar14.a(), r(jlrVar, oiyVar, oiyVar2, oiyVar3, oiyVar4, oiyVar5, oiyVar6, oiyVar7, oiyVar8, oiyVar9, oiyVar10, oiyVar12, oiyVar13, oiyVar14), (jjd) oiyVar11.a(), (Executor) oiyVar6.a(), (lfb) oiyVar3.a(), (kcq) oiyVar5.a(), (lfb) oiyVar16.a(), (jhy) oiyVar4.a(), null, null, null, null);
    }

    public static jit t(jie jieVar, int i) {
        nfh t = jit.g.t();
        String str = jieVar.c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jit jitVar = (jit) t.b;
        str.getClass();
        int i2 = jitVar.a | 1;
        jitVar.a = i2;
        jitVar.b = str;
        int i3 = jieVar.d;
        jitVar.a = i2 | 2;
        jitVar.c = i3;
        String aA = lre.aA(jieVar);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jit jitVar2 = (jit) t.b;
        aA.getClass();
        int i4 = jitVar2.a | 4;
        jitVar2.a = i4;
        jitVar2.d = aA;
        jitVar2.e = i - 1;
        jitVar2.a = i4 | 8;
        if ((jieVar.a & 32) != 0) {
            noi noiVar = jieVar.g;
            if (noiVar == null) {
                noiVar = noi.b;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jit jitVar3 = (jit) t.b;
            noiVar.getClass();
            jitVar3.f = noiVar;
            jitVar3.a |= 16;
        }
        return (jit) t.cz();
    }

    public static boolean u(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean v(Context context, jkr jkrVar) {
        jkrVar.name();
        int i = jmk.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", jkrVar.d).commit();
    }

    public static void w(Context context) {
        int i = jmk.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static jkr x(Context context) {
        try {
            return jkr.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", jkr.NEW_FILE_KEY.d));
        } catch (IllegalArgumentException unused) {
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return jkr.USE_CHECKSUM_ONLY;
        }
    }

    public static boolean y(noi noiVar) {
        try {
            kqa.a(noiVar);
            return true;
        } catch (IllegalArgumentException e) {
            jmk.h(e, "Invalid transform specification");
            return false;
        }
    }

    public static final void z(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(-1);
        textView.setSelected(true);
    }
}
