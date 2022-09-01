package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.nio.charset.StandardCharsets;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: fyb  reason: default package */
/* loaded from: classes.dex */
public class fyb {
    private static Context a;
    public static Boolean b;
    public static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Boolean f;

    public static boolean A(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static fry B(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        ax(creator);
        int length = byteArrayExtra.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, length);
        obtain.setDataPosition(0);
        fry fryVar = (fry) creator.createFromParcel(obtain);
        obtain.recycle();
        return fryVar;
    }

    public static int C(Parcel parcel) {
        return D(parcel, 20293);
    }

    public static int D(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void E(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void F(Parcel parcel, int i, boolean z) {
        H(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void G(Parcel parcel, int i, float f2) {
        H(parcel, i, 4);
        parcel.writeFloat(f2);
    }

    public static void H(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void I(Parcel parcel, int i, int i2) {
        H(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void J(Parcel parcel, int i, long j) {
        H(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void K(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeBundle(bundle);
        E(parcel, D);
    }

    public static void L(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeByteArray(bArr);
        E(parcel, D);
    }

    public static void M(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        E(parcel, D);
    }

    public static void N(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeStrongBinder(iBinder);
        E(parcel, D);
    }

    public static void O(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeIntArray(iArr);
        E(parcel, D);
    }

    public static void P(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        H(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void Q(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int D = D(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        E(parcel, D);
    }

    public static void R(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int D = D(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        E(parcel, D);
    }

    public static void S(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeString(str);
        E(parcel, D);
    }

    public static void T(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeStringArray(strArr);
        E(parcel, D);
    }

    public static void U(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeStringList(list);
        E(parcel, D);
    }

    public static void V(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int D = D(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                aN(parcel, parcelable, i2);
            }
        }
        E(parcel, D);
    }

    public static void W(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int D = D(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                aN(parcel, parcelable, 0);
            }
        }
        E(parcel, D);
    }

    public static float X(Parcel parcel, int i) {
        an(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int Y(int i) {
        return (char) i;
    }

    public static int Z(Parcel parcel) {
        return parcel.readInt();
    }

    public static void aA(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    public static void aB() {
        aC("Must not be called on the main application thread");
    }

    public static void aC(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void aD(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void aE(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static void aF(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void aG(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void aH(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static gen aI(fof fofVar) {
        fxa fxaVar = new fxa();
        fofVar.d(new frp(fofVar, fxaVar, 0, null));
        return (gen) fxaVar.a;
    }

    public static boolean aJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String aK(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void aL(String str, Object obj, List list) {
        String valueOf = String.valueOf(obj);
        list.add(str + "=" + valueOf);
    }

    private static void aN(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int aa(Parcel parcel, int i) {
        an(parcel, i, 4);
        return parcel.readInt();
    }

    public static int ab(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int ac(Parcel parcel) {
        int readInt = parcel.readInt();
        int ab = ab(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (Y(readInt) != 20293) {
            throw new frx("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = ab + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new frx("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    public static long ad(Parcel parcel, int i) {
        an(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle ae(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + ab);
        return readBundle;
    }

    public static IBinder af(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + ab);
        return readStrongBinder;
    }

    public static Parcelable ag(Parcel parcel, int i, Parcelable.Creator creator) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + ab);
        return parcelable;
    }

    public static Integer ah(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        if (ab == 0) {
            return null;
        }
        av(parcel, ab, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static String ai(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + ab);
        return readString;
    }

    public static ArrayList aj(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + ab);
        return arrayList;
    }

    public static ArrayList ak(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + ab);
        return createStringArrayList;
    }

    public static ArrayList al(Parcel parcel, int i, Parcelable.Creator creator) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + ab);
        return createTypedArrayList;
    }

    public static void am(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new frx("Overread allowed size end=" + i, parcel);
    }

    public static void an(Parcel parcel, int i, int i2) {
        int ab = ab(parcel, i);
        if (ab == i2) {
            return;
        }
        String hexString = Integer.toHexString(ab);
        throw new frx("Expected size " + i2 + " got " + ab + " (0x" + hexString + ")", parcel);
    }

    public static void ao(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + ab(parcel, i));
    }

    public static boolean ap(Parcel parcel, int i) {
        an(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] aq(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + ab);
        return createByteArray;
    }

    public static int[] ar(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + ab);
        return createIntArray;
    }

    public static Object[] as(Parcel parcel, int i, Parcelable.Creator creator) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + ab);
        return createTypedArray;
    }

    public static String[] at(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + ab);
        return createStringArray;
    }

    public static byte[][] au(Parcel parcel, int i) {
        int ab = ab(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (ab == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + ab);
        return bArr;
    }

    public static void av(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        throw new frx("Expected size " + i2 + " got " + i + " (0x" + hexString + ")", parcel);
    }

    public static String aw(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static Object ax(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static void ay(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void az(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static fzf b(jnz jnzVar) {
        jnzVar.getClass();
        return new fxy(jnzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fzf c(joa joaVar) {
        joaVar.getClass();
        return new fxz(joaVar);
    }

    public static fwq d(int i, long j) {
        return new fwq(i, j);
    }

    public static fvx e(Context context) {
        return new fvx(context);
    }

    public static fvu f() {
        return new fvu(-1.0f, 1, 2, null);
    }

    public static byte[] h(String str) {
        return j(str, Build.VERSION.SDK_INT, null);
    }

    public static byte[] i(String str, Throwable th) {
        return j(str, Build.VERSION.SDK_INT, th);
    }

    public static byte[] j(String str, int i, Throwable th) {
        String concat = "ERROR : ".concat(str);
        if (nqd.a.a().c()) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", Integer.valueOf(i), "22.30.80-000")));
        }
        if (nqd.a.a().b() && th != null) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, Log.getStackTraceString(th))));
        }
        if (nqd.a.a().a()) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", Build.FINGERPRINT)));
        }
        return concat.getBytes(StandardCharsets.UTF_8);
    }

    public static File k(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void l(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        throw new fsx("Failed to rename " + valueOf + " -> " + valueOf2 + ".");
    }

    public static void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!giw.k(file)) {
                String valueOf = String.valueOf(file);
                Log.e("DG", "Failed to clean up temporary file " + valueOf + ".");
            }
        }
        list.clear();
    }

    public static void o(fws fwsVar) {
        Object obj = fwsVar.c;
        try {
            if (!((File) obj).exists() && !((File) obj).createNewFile()) {
                String obj2 = fwsVar.toString();
                throw new fsx("Failed to touch last-used file for " + obj2 + ".");
            }
            if (((File) obj).setLastModified(System.currentTimeMillis())) {
                return;
            }
            String obj3 = fwsVar.toString();
            throw new fsx("Failed to update last-used timestamp for " + obj3 + ".");
        } catch (IOException e2) {
            String obj4 = fwsVar.toString();
            String obj5 = e2.toString();
            throw new fsx("Failed to touch last-used file for " + obj4 + ": " + obj5);
        }
    }

    public static fws p(Context context, List list) {
        return r("tmp_".concat(String.valueOf(UUID.randomUUID().toString())), context);
    }

    public static fws q(ftc ftcVar, Context context, List list) {
        fws r = r(ftcVar.a, context);
        if (!r.d()) {
            return null;
        }
        o(r);
        return r;
    }

    public static fws r(String str, Context context) {
        File file = new File(k(context), str);
        return new fws(new ijk(file, "the.apk"), new File(file, "opt"), new File(file, "t"), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public static synchronized boolean s(Context context) {
        Boolean bool;
        synchronized (fyb.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = d) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            d = null;
            if (t()) {
                d = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    d = true;
                } catch (ClassNotFoundException unused) {
                    d = false;
                }
            }
            a = applicationContext;
            return d.booleanValue();
        }
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static int v(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static boolean w(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (e == null) {
            e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return e.booleanValue();
    }

    public static boolean x(Context context) {
        if (!w(context) || Build.VERSION.SDK_INT >= 24) {
            if (f == null) {
                f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (!f.booleanValue()) {
                return false;
            }
            return !t() || u();
        }
        return true;
    }

    public static void y(Context context, Throwable th) {
        try {
            ax(context);
            ax(th);
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
        }
    }

    public static String z(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public List a() {
        return null;
    }

    public List g() {
        return null;
    }

    public static fnx aM(Status status) {
        return status.h != null ? new foh(status) : new fnx(status);
    }
}
