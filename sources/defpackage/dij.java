package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hmm.DataManagerImpl;
import com.google.android.apps.inputmethod.libs.hmm.EngineFactory;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.SettingManagerImpl;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dij  reason: default package */
/* loaded from: classes.dex */
public abstract class dij implements diu {
    private final inm c = new btf(this, 13);
    private final ArrayList d;
    private Boolean e;
    public final ino h;
    public final boolean[] i;
    public final EngineFactory j;
    protected final Context k;
    protected boolean l;
    public final ArrayList m;
    public final SettingManagerImpl n;
    private final Handler o;
    private boolean p;
    public static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory");
    private static final int[] a = {24, 24, 23, 24};
    private static final int[] q = {4, 4, 3, 4};
    private static final String[] b = {"new_words_dictionary_accessor", "contacts_dictionary_accessor", "user_dictionary_accessor", "shortcuts_dictionary_accessor"};
    public static final int[] g = {R.string.f160330_resource_name_obfuscated_res_0x7f14063e, R.string.f161460_resource_name_obfuscated_res_0x7f1406b3, R.string.f162280_resource_name_obfuscated_res_0x7f140705, R.string.f161020_resource_name_obfuscated_res_0x7f140686};
    private static final int[] r = {2, 4, 3, 5};

    /* JADX INFO: Access modifiers changed from: protected */
    public dij(Context context) {
        EngineFactory a2 = EngineFactory.a();
        long nativeGetSettingManager = a2.nativeGetSettingManager(a2.b);
        this.n = nativeGetSettingManager != 0 ? new SettingManagerImpl(nativeGetSettingManager) : null;
        dip.b();
        this.i = new boolean[4];
        this.j = EngineFactory.a();
        this.d = lre.A();
        this.e = null;
        this.o = new Handler(Looper.getMainLooper());
        this.m = new ArrayList();
        this.h = ino.M(context);
        this.k = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void O(nfh nfhVar, String str, int i, int i2) {
        if (nfhVar == null) {
            return;
        }
        nfh t = mpm.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mpm mpmVar = (mpm) t.b;
        str.getClass();
        int i3 = mpmVar.a | 2;
        mpmVar.a = i3;
        mpmVar.c = str;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        mpmVar.b = i4;
        int i5 = i3 | 1;
        mpmVar.a = i5;
        int i6 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        mpmVar.d = i6;
        mpmVar.a = i5 | 4;
        mpm mpmVar2 = (mpm) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpn mpnVar = (mpn) nfhVar.b;
        mpn mpnVar2 = mpn.b;
        mpmVar2.getClass();
        nga ngaVar = mpnVar.a;
        if (!ngaVar.c()) {
            mpnVar.a = nfm.H(ngaVar);
        }
        mpnVar.a.add(mpmVar2);
    }

    private final String l(int i) {
        String[] i2 = i();
        if (i2 != null) {
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            return i2[i3];
        }
        return null;
    }

    private final void m(nfh nfhVar) {
        int[] b2 = dip.b();
        for (int i = 0; i < 4; i++) {
            int i2 = b2[i];
            if (N(i2)) {
                String H = H(i2);
                int i3 = i2 - 1;
                int[] iArr = q;
                if (i2 != 0) {
                    int i4 = iArr[i3];
                    int i5 = r[i3];
                    if (H != null && i4 != 1) {
                        O(nfhVar, H, i4, i5);
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public void A() {
        djm q2 = q();
        DataManagerImpl J = J();
        if (q2 == null || J == null) {
            return;
        }
        Boolean bool = this.e;
        boolean z = false;
        if (bool != null && bool.booleanValue() != irs.d()) {
            z = true;
        }
        this.e = Boolean.valueOf(irs.d());
        if (!div.c().l(this) && !z) {
            return;
        }
        q2.e(b(), J);
        div c = div.c();
        if (c.l(this)) {
            c.c.put(this, (djm) c.d.get(this));
            c.d.remove(this);
            ((ltd) ((ltd) div.b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "useNewData", 339, "HmmDataFacilitator.java")).w("useNewData(): consumer %s", getClass().getName());
        }
        p();
    }

    public final synchronized void B(dig digVar) {
        if (!this.d.contains(digVar)) {
            this.d.add(digVar);
        }
    }

    public final void C(dih dihVar) {
        synchronized (this.m) {
            if (!this.m.contains(dihVar)) {
                this.m.add(new dif(dihVar, new Handler()));
            }
        }
    }

    public final synchronized void D(dig digVar) {
        this.d.remove(digVar);
    }

    public final void E() {
        String[] d = d();
        for (int i = 0; i < d.length; i++) {
            String[] e = e();
            mpo mpoVar = null;
            if (e[i] != null) {
                djm q2 = q();
                mpo b2 = q2 == null ? null : q2.b(e[i]);
                if (b2 != null) {
                    nfh nfhVar = (nfh) b2.N(5);
                    nfhVar.cG(b2);
                    o(i, nfhVar);
                    mpoVar = (mpo) nfhVar.cz();
                }
            }
            if (mpoVar == null) {
                ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "updateAllEngineSettingSchemes", 449, "AbstractHmmEngineFactory.java")).w("Missing data for engine %s", d[i]);
            } else {
                SettingManagerImpl settingManagerImpl = this.n;
                if (settingManagerImpl == null || !settingManagerImpl.a(d[i], mpoVar.q())) {
                    throw new lgj("Failed to enroll engine setting scheme: ".concat(String.valueOf(d[i])));
                }
            }
        }
    }

    public final boolean F(String str, String str2, int i, int i2) {
        DataManagerImpl J = J();
        File r2 = r(str);
        if (r2.exists()) {
            try {
                FileInputStream openFileInput = this.k.openFileInput(str);
                if (J != null) {
                    if (J.nativeEnrollMutableDictFd(J.a, str2, i, openFileInput.getFD(), 0, (int) r2.length(), i2)) {
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        return true;
                    }
                }
                ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "enrollDictionary", 763, "AbstractHmmEngineFactory.java")).w("Failed to enroll local dictionary %s", str);
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public int G(int i) {
        return i == 4 ? 4 : 0;
    }

    public final String H(int i) {
        String[] k = k();
        if (k != null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            return k[i2];
        }
        return null;
    }

    public final DataManagerImpl J() {
        EngineFactory engineFactory = this.j;
        long nativeGetDataManager = engineFactory.nativeGetDataManager(engineFactory.b);
        if (nativeGetDataManager != 0) {
            return new DataManagerImpl(nativeGetDataManager);
        }
        return null;
    }

    public final HmmEngineInterfaceImpl K(String str) {
        if (!this.p) {
            return null;
        }
        A();
        for (String str2 : d()) {
            if (str2.equals(str)) {
                EngineFactory engineFactory = this.j;
                long nativeCreateEngine = engineFactory.nativeCreateEngine(engineFactory.b, str, "");
                if (nativeCreateEngine == 0) {
                    return null;
                }
                return new HmmEngineInterfaceImpl(nativeCreateEngine);
            }
        }
        return null;
    }

    public final MutableDictionaryAccessorInterfaceImpl L(String str, String str2) {
        if (q() == null) {
            return null;
        }
        if (!this.l && TextUtils.equals(str2, H(3))) {
            this.l = true;
        }
        EngineFactory engineFactory = this.j;
        if (str == null || str2 == null) {
            String.format("ERROR when creating MutableDictionaryAccessorInterface: engineId=%s userId=%s dataId=%s", str, "", str2);
            ((luc) ((luc) EngineFactory.a.c()).k("com/google/android/apps/inputmethod/libs/hmm/EngineFactory", "createMutableDictionaryAccessor", 167, "EngineFactory.java")).J("ERROR when creating MutableDictionaryAccessorInterface: engineId=%s userId=%s dataId=%s", str, "", str2);
        }
        long nativeCreateMutableDictionaryAccessor = engineFactory.nativeCreateMutableDictionaryAccessor(engineFactory.b, str, "", str2);
        if (nativeCreateMutableDictionaryAccessor == 0) {
            String.format("ERROR when creating MutableDictionaryAccessorInterface: engineId=%s userId=%s dataId=%s", str, "", str2);
            ((luc) ((luc) EngineFactory.a.c()).k("com/google/android/apps/inputmethod/libs/hmm/EngineFactory", "createMutableDictionaryAccessor", 181, "EngineFactory.java")).J("ERROR when creating MutableDictionaryAccessorInterface: engineId=%s userId=%s dataId=%s", str, "", str2);
            nativeCreateMutableDictionaryAccessor = 0;
        }
        if (nativeCreateMutableDictionaryAccessor == 0) {
            return null;
        }
        return new MutableDictionaryAccessorInterfaceImpl(nativeCreateMutableDictionaryAccessor);
    }

    public final MutableDictionaryAccessorInterfaceImpl M(int i) {
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = null;
        if (q() == null) {
            return null;
        }
        String l = l(i);
        String H = H(i);
        if (l != null && H != null) {
            mutableDictionaryAccessorInterfaceImpl = L(l, H);
        }
        if (i == 3 && mutableDictionaryAccessorInterfaceImpl != null) {
            this.l = true;
        }
        return mutableDictionaryAccessorInterfaceImpl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean N(int i) {
        boolean[] zArr = this.i;
        int i2 = i - 1;
        if (i != 0) {
            return zArr[i2];
        }
        throw null;
    }

    protected String b() {
        return "data_scheme";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        int i = 0;
        while (true) {
            dip.b();
            if (i < 4) {
                this.i[i] = this.h.aj(g[i]);
                i++;
            } else {
                return;
            }
        }
    }

    protected abstract String[] d();

    protected abstract String[] e();

    public String g() {
        return null;
    }

    public dij ge() {
        return null;
    }

    protected void gf() {
        if (q() == null) {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "initialize", 220, "AbstractHmmEngineFactory.java")).t("Primay data provider is null!!");
        }
        this.h.Z(this.c, R.string.f161460_resource_name_obfuscated_res_0x7f1406b3, R.string.f161020_resource_name_obfuscated_res_0x7f140686, R.string.f162280_resource_name_obfuscated_res_0x7f140705);
        c();
        s();
        t();
        E();
        v();
        x();
        h();
        String g2 = g();
        if (g2 != null) {
            dii.a.put(g2, this);
        }
    }

    protected void h() {
    }

    protected String[] i() {
        return b;
    }

    protected String[] j() {
        return null;
    }

    protected String[] k() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(int i, nfh nfhVar) {
        mpo mpoVar = (mpo) nfhVar.b;
        if ((mpoVar.a & 16) != 0) {
            mpn mpnVar = mpoVar.f;
            if (mpnVar == null) {
                mpnVar = mpn.b;
            }
            nfh nfhVar2 = (nfh) mpnVar.N(5);
            nfhVar2.cG(mpnVar);
            m(nfhVar2);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar2 = (mpo) nfhVar.b;
            mpn mpnVar2 = (mpn) nfhVar2.cz();
            mpnVar2.getClass();
            mpoVar2.f = mpnVar2;
            mpoVar2.a |= 16;
        }
        mpn mpnVar3 = ((mpo) nfhVar.b).e;
        if (mpnVar3 == null) {
            mpnVar3 = mpn.b;
        }
        nfh nfhVar3 = (nfh) mpnVar3.N(5);
        nfhVar3.cG(mpnVar3);
        m(nfhVar3);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar3 = (mpo) nfhVar.b;
        mpn mpnVar4 = (mpn) nfhVar3.cz();
        mpnVar4.getClass();
        mpoVar3.e = mpnVar4;
        mpoVar3.a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        if (this.l) {
            djn.c(this, true);
            this.l = false;
        }
        c();
        s();
        t();
        E();
        v();
        x();
        h();
    }

    public final djm q() {
        return div.c().d(this);
    }

    public final File r(String str) {
        return this.k.getFileStreamPath(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        this.p = false;
        DataManagerImpl J = J();
        djm q2 = q();
        if (q2 == null || J == null || !q2.d(b(), J)) {
            return;
        }
        this.p = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        String[] k = k();
        if (k == null) {
            return;
        }
        int[] iArr = a;
        for (int i = 0; i < 4; i++) {
            String str = k[i];
            if (str != null) {
                u(str, iArr[i], G(dip.b()[i]));
            }
        }
    }

    public final void u(String str, int i, int i2) {
        if (F(str, str, i, i2)) {
            return;
        }
        DataManagerImpl J = J();
        if (J != null && J.a(str, i, i2)) {
            return;
        }
        ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "enrollMutableDictionary", 731, "AbstractHmmEngineFactory.java")).w("Failed to enroll local dictionary %s", str);
    }

    public final void v() {
        String[] i = i();
        String[] j = j();
        if (i == null || j == null) {
            return;
        }
        for (int i2 = 0; i2 < i.length; i2++) {
            String str = i[i2];
            String str2 = j[i2];
            if (str != null && str2 != null) {
                djm q2 = q();
                mpo b2 = q2 == null ? null : q2.b(str2);
                if (b2 == null) {
                    ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "enrollMutableDictionaryAccessorSettingSchemes", 599, "AbstractHmmEngineFactory.java")).w("Cannot load mutable dictionary settings from:%s", j[i2]);
                } else {
                    byte[] q3 = b2.q();
                    SettingManagerImpl settingManagerImpl = this.n;
                    if (settingManagerImpl != null) {
                        settingManagerImpl.a(str, q3);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        String concat = "pref_key_contacts_imported_".concat(String.valueOf(H(2)));
        if (!this.h.ak(concat)) {
            gyk.i(this.k).B();
            this.h.f(concat, true);
        }
    }

    protected final void x() {
        boolean contains;
        String H = H(3);
        if (!TextUtils.isEmpty(H)) {
            dkj dkjVar = dkj.b;
            if (dkjVar == null) {
                synchronized (dkj.class) {
                    dkjVar = dkj.b;
                    if (dkjVar == null) {
                        dkjVar = new dkj();
                        dkj.b = dkjVar;
                    }
                }
            }
            dkj dkjVar2 = dkjVar;
            int i = a[2];
            int G = G(3);
            String l = l(3);
            File filesDir = guw.a().getFilesDir();
            dki dkiVar = new dki("".concat(String.valueOf(H)), l, H, i, G, new File(filesDir, H), String.valueOf(H).concat("_migration_tmp"), new File(filesDir, String.valueOf(H).concat(".migration_tmp")), new File(filesDir, String.valueOf(H).concat(".migration_new")));
            String str = dkiVar.a;
            synchronized (dkjVar2.c) {
                contains = dkjVar2.d.contains(str);
            }
            if (contains) {
                return;
            }
            if (!dkiVar.h.exists()) {
                EngineFactory engineFactory = this.j;
                if (!engineFactory.nativeShouldMigrateUserDictionary(engineFactory.b, l, "", H)) {
                    return;
                }
                gyk.i(guw.a()).B();
                if (!dkiVar.f.exists()) {
                    return;
                }
                DataManagerImpl J = J();
                if (J != null) {
                    J.a(H, i, G);
                }
                if (!dkj.b(dkiVar.f, dkiVar.h)) {
                    return;
                }
                dkjVar2.a(this, dkiVar);
                return;
            }
            dkjVar2.a(this, dkiVar);
        }
    }

    public final synchronized void y() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dig) arrayList.get(i)).K();
        }
    }

    @Override // defpackage.diu
    public final void z() {
        gf();
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                dif difVar = (dif) it.next();
                difVar.b.post(new dgd(difVar, 3));
            }
        }
    }

    public final void I(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        String H = H(i);
        if (H == null) {
            return;
        }
        this.o.post(new dfe(this, H, a[i2], i, 2));
    }
}
