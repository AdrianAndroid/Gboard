package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.inputmethod.latin.firstrun.LatinFirstRunActivity;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.NativeProfiler;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: boj  reason: default package */
/* loaded from: classes.dex */
public class boj extends boa {
    public bqv c;
    private bnw j;
    private gvn k;
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/latin/LatinApp");
    private static final gwa a = new gwa();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
        if (defpackage.jam.b == false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [hqy, gzv] */
    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boj.c():void");
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    protected final hqu f(Context context) {
        return new box(context, new jaq(context));
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    public final Class g() {
        return LatinFirstRunActivity.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    public final void h(imx imxVar) {
        int[] iArr = {R.array.f1860_resource_name_obfuscated_res_0x7f030059, R.array.f1900_resource_name_obfuscated_res_0x7f03005d, R.array.f1790_resource_name_obfuscated_res_0x7f030052, R.array.f1820_resource_name_obfuscated_res_0x7f030055, R.array.f1830_resource_name_obfuscated_res_0x7f030056, R.array.f1840_resource_name_obfuscated_res_0x7f030057, R.array.f1850_resource_name_obfuscated_res_0x7f030058, R.array.f1870_resource_name_obfuscated_res_0x7f03005a, R.array.f1920_resource_name_obfuscated_res_0x7f03005f, R.array.f1910_resource_name_obfuscated_res_0x7f03005e, R.array.f1940_resource_name_obfuscated_res_0x7f030061, R.array.f1880_resource_name_obfuscated_res_0x7f03005b, R.array.f1890_resource_name_obfuscated_res_0x7f03005c, R.array.f1780_resource_name_obfuscated_res_0x7f030051};
        for (int i = 0; i < 14; i++) {
            imxVar.g(iArr[i]);
        }
        super.h(imxVar);
        imxVar.i(R.string.f160940_resource_name_obfuscated_res_0x7f14067e, new boh(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0554, code lost:
        if (r5 <= 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x07f5, code lost:
        if (r8.isEmpty() == false) goto L104;
     */
    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void i() {
        /*
            Method dump skipped, instructions count: 2300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boj.i():void");
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    public final void j() {
        mmk mmkVar;
        bsk bskVar = new bsk(ino.M(this), ino.K(this, null), this);
        if (bskVar.b.ah(R.string.f161850_resource_name_obfuscated_res_0x7f1406da) || bskVar.b.ah(R.string.f161660_resource_name_obfuscated_res_0x7f1406c7) || bskVar.b.ah(R.string.f161770_resource_name_obfuscated_res_0x7f1406d2) || bskVar.b.ah(R.string.f161680_resource_name_obfuscated_res_0x7f1406c9) || bskVar.b.ah(R.string.f161730_resource_name_obfuscated_res_0x7f1406ce) || bskVar.b.ah(R.string.f161670_resource_name_obfuscated_res_0x7f1406c8) || bskVar.b.ah(R.string.f161830_resource_name_obfuscated_res_0x7f1406d8)) {
            ((ltd) ((ltd) bsk.a.b()).k("com/google/android/apps/inputmethod/latin/utils/PreferenceMigrator", "doMigration", 96, "PreferenceMigrator.java")).t("doMigration()");
            bskVar.b(R.string.f161660_resource_name_obfuscated_res_0x7f1406c7, R.string.f160360_resource_name_obfuscated_res_0x7f140641);
            bskVar.b(R.string.f161710_resource_name_obfuscated_res_0x7f1406cc, R.string.f160730_resource_name_obfuscated_res_0x7f140669);
            bskVar.b(R.string.f161780_resource_name_obfuscated_res_0x7f1406d3, R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
            bskVar.b(R.string.f161750_resource_name_obfuscated_res_0x7f1406d0, R.string.f161040_resource_name_obfuscated_res_0x7f140688);
            bskVar.b(R.string.f161740_resource_name_obfuscated_res_0x7f1406cf, R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
            bskVar.b(R.string.f161790_resource_name_obfuscated_res_0x7f1406d4, R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
            bskVar.b(R.string.f161760_resource_name_obfuscated_res_0x7f1406d1, R.string.f161070_resource_name_obfuscated_res_0x7f14068b);
            bskVar.b(R.string.f161770_resource_name_obfuscated_res_0x7f1406d2, R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
            bskVar.b(R.string.f161730_resource_name_obfuscated_res_0x7f1406ce, R.string.f160840_resource_name_obfuscated_res_0x7f140674);
            bskVar.b(R.string.f161670_resource_name_obfuscated_res_0x7f1406c8, R.string.f160400_resource_name_obfuscated_res_0x7f140645);
            bskVar.b(R.string.f161820_resource_name_obfuscated_res_0x7f1406d7, R.string.f161460_resource_name_obfuscated_res_0x7f1406b3);
            bskVar.b(R.string.f161720_resource_name_obfuscated_res_0x7f1406cd, R.string.f160740_resource_name_obfuscated_res_0x7f14066a);
            bskVar.b(R.string.f161870_resource_name_obfuscated_res_0x7f1406dc, R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
            if (bskVar.b.ah(R.string.f161900_resource_name_obfuscated_res_0x7f1406df)) {
                ino inoVar = bskVar.b;
                inoVar.u(R.string.f160340_resource_name_obfuscated_res_0x7f14063f, inoVar.y(R.string.f161900_resource_name_obfuscated_res_0x7f1406df));
                bskVar.b.v(R.string.f161900_resource_name_obfuscated_res_0x7f1406df);
            }
            bskVar.d(R.string.f161910_resource_name_obfuscated_res_0x7f1406e0, R.string.f162710_resource_name_obfuscated_res_0x7f140731);
            if (bskVar.b.ah(R.string.f161880_resource_name_obfuscated_res_0x7f1406dd)) {
                ino inoVar2 = bskVar.b;
                inoVar2.r(R.string.f162560_resource_name_obfuscated_res_0x7f140721, inoVar2.z(R.string.f161880_resource_name_obfuscated_res_0x7f1406dd));
                bskVar.b.v(R.string.f161880_resource_name_obfuscated_res_0x7f1406dd);
            }
            bskVar.d(R.string.f161830_resource_name_obfuscated_res_0x7f1406d8, R.string.f161530_resource_name_obfuscated_res_0x7f1406ba);
            if (bskVar.b.ah(R.string.f161840_resource_name_obfuscated_res_0x7f1406d9)) {
                String y = bskVar.b.y(R.string.f161840_resource_name_obfuscated_res_0x7f1406d9);
                int parseInt = Integer.parseInt(y);
                bskVar.b.v(R.string.f161840_resource_name_obfuscated_res_0x7f1406d9);
                if (parseInt == 3) {
                    bskVar.b.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, bskVar.d.getString(R.string.f160100_resource_name_obfuscated_res_0x7f140627));
                } else if (parseInt == 4) {
                    bskVar.b.u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, bskVar.d.getString(R.string.f160090_resource_name_obfuscated_res_0x7f140626));
                } else if (parseInt == 2 || parseInt == 0) {
                    bskVar.c(parseInt);
                } else {
                    ((ltd) ((ltd) bsk.a.c()).k("com/google/android/apps/inputmethod/latin/utils/PreferenceMigrator", "migrateKeyboardTheme", 227, "PreferenceMigrator.java")).E("Theme key %s with value %d is not defined.", y, parseInt);
                }
            } else if (bskVar.b.ah(R.string.f161810_resource_name_obfuscated_res_0x7f1406d6)) {
                String y2 = bskVar.b.y(R.string.f161810_resource_name_obfuscated_res_0x7f1406d6);
                int parseInt2 = Integer.parseInt(y2);
                bskVar.b.v(R.string.f161810_resource_name_obfuscated_res_0x7f1406d6);
                if (parseInt2 == 2 || parseInt2 == 0) {
                    bskVar.c(parseInt2);
                } else {
                    ((ltd) ((ltd) bsk.a.c()).k("com/google/android/apps/inputmethod/latin/utils/PreferenceMigrator", "migrateKeyboardTheme", 238, "PreferenceMigrator.java")).E("Theme %s with value %d is not defined.", y2, parseInt2);
                }
            }
            if (bskVar.b.ah(R.string.f161700_resource_name_obfuscated_res_0x7f1406cb)) {
                bskVar.b.j(huk.b(ibz.d), htq.b(htq.a(bskVar.b.y(R.string.f161700_resource_name_obfuscated_res_0x7f1406cb)).a().listIterator()));
                bskVar.b.v(R.string.f161700_resource_name_obfuscated_res_0x7f1406cb);
            }
            bskVar.e(R.string.f161840_resource_name_obfuscated_res_0x7f1406d9);
            bskVar.e(R.string.f161810_resource_name_obfuscated_res_0x7f1406d6);
            bskVar.e(R.string.f161850_resource_name_obfuscated_res_0x7f1406da);
            bskVar.e(R.string.f161690_resource_name_obfuscated_res_0x7f1406ca);
            bskVar.e(R.string.f161890_resource_name_obfuscated_res_0x7f1406de);
            bskVar.e(R.string.f161860_resource_name_obfuscated_res_0x7f1406db);
            bskVar.e(R.string.f161800_resource_name_obfuscated_res_0x7f1406d5);
            SharedPreferences sharedPreferences = bskVar.d.getSharedPreferences("local_prefs", 0);
            if (sharedPreferences.contains("device_sync_id")) {
                bskVar.b.j("user_guid", sharedPreferences.getString("device_sync_id", null));
            }
        }
        if (bskVar.b.aj(R.string.f161070_resource_name_obfuscated_res_0x7f14068b) && !bskVar.b.ak("migrate_sync_service")) {
            bskVar.b.f("migrate_sync_service", true);
        }
        bskVar.a("private_recent_gifs_shared", "recent_gifs_shared");
        bskVar.a("recent_gifs_shared", "recent_gifs_shared");
        bskVar.a("private_recent_sticker_shared", "recent_sticker_shared");
        bskVar.a("recent_sticker_shared", "recent_sticker_shared");
        bskVar.a("private_recent_bitmoji_shared", "recent_bitmoji_shared");
        bskVar.a("recent_bitmoji_shared", "recent_bitmoji_shared");
        if (bskVar.b.ah(R.string.f160350_resource_name_obfuscated_res_0x7f140640)) {
            bskVar.c.U(R.string.f160350_resource_name_obfuscated_res_0x7f140640, bskVar.b.N(R.string.f160350_resource_name_obfuscated_res_0x7f140640));
            bskVar.b.v(R.string.f160350_resource_name_obfuscated_res_0x7f140640);
        }
        for (Map.Entry entry : bskVar.b.R().entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("recent_softkeys_")) {
                bskVar.c.V(str.replace("private_", ""), entry.getValue());
                bskVar.b.w(str);
            }
        }
        if (bskVar.b.al("pref_key_should_reset_suggestions_pref", true, true)) {
            bskVar.b.q(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4, true);
            bskVar.b.f("pref_key_should_reset_suggestions_pref", false);
        }
        if (!bskVar.b.x(R.string.f160370_resource_name_obfuscated_res_0x7f140642, true)) {
            hrx.y(bskVar.d);
            bskVar.e = ijf.b(new bqj(bskVar, 7), hrx.b, hrx.c);
            bskVar.e.e(mjl.a);
        }
        super.j();
        Context applicationContext = getApplicationContext();
        oll.e(applicationContext, "appContext");
        long j = hyr.a;
        hyr a2 = hyq.a();
        if (a2 != null && a2.d) {
            ((ltd) hys.a.b()).j(ltp.e("com/google/android/libraries/inputmethod/lethe/notification/CrashUtils", "clearCacheIfNeeded", 23, "CrashUtils.kt")).J("Cleared cache directory: deleteCache=%s, deleteDeCache=%s, duration=%s", Boolean.valueOf(jan.b.e(applicationContext.getCacheDir())), Boolean.valueOf(jan.b.e(jbt.m(applicationContext).getCacheDir())), Long.valueOf(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
        }
        synchronized (mmk.a) {
            if (!mmk.b.containsKey("[DEFAULT]")) {
                fyb.ax(applicationContext);
                Resources resources = applicationContext.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string.f149620_resource_name_obfuscated_res_0x7f14012a);
                String aw = fyb.aw("google_app_id", resources, resourcePackageName);
                mmm mmmVar = TextUtils.isEmpty(aw) ? null : new mmm(aw, fyb.aw("google_api_key", resources, resourcePackageName), fyb.aw("firebase_database_url", resources, resourcePackageName), fyb.aw("ga_trackingId", resources, resourcePackageName), fyb.aw("gcm_defaultSenderId", resources, resourcePackageName), fyb.aw("google_storage_bucket", resources, resourcePackageName), fyb.aw("project_id", resources, resourcePackageName));
                if (mmmVar != null) {
                    AtomicReference atomicReference = mmh.a;
                    if (applicationContext.getApplicationContext() instanceof Application) {
                        Application application = (Application) applicationContext.getApplicationContext();
                        if (mmh.a.get() == null) {
                            mmh mmhVar = new mmh();
                            AtomicReference atomicReference2 = mmh.a;
                            while (true) {
                                if (!atomicReference2.compareAndSet(null, mmhVar)) {
                                    if (atomicReference2.get() != null) {
                                        break;
                                    }
                                } else {
                                    fot.b(application);
                                    fot.a.a(mmhVar);
                                    break;
                                }
                            }
                        }
                    }
                    Context applicationContext2 = applicationContext.getApplicationContext() == null ? applicationContext : applicationContext.getApplicationContext();
                    synchronized (mmk.a) {
                        fyb.aE(!mmk.b.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
                        fyb.aH(applicationContext2, "Application context cannot be null.");
                        mmkVar = new mmk(applicationContext2, "[DEFAULT]", mmmVar);
                        mmk.b.put("[DEFAULT]", mmkVar);
                    }
                    mmkVar.f();
                } else {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                }
            } else {
                mmk.a();
            }
        }
        cbk.b = ((Long) cbk.c.c()).intValue();
        if (!((Boolean) car.c.c()).booleanValue()) {
            kcu.K(null);
        } else {
            car.c().hQ(hcb.b);
        }
        if (this.j == null) {
            bnw bnwVar = new bnw(getApplicationContext());
            this.j = bnwVar;
            ijl.b().c(bnwVar.g, irp.class, gyc.a);
            hhq.p(bnwVar, bnw.a, itm.d, bnw.b, bnw.c, bnw.d, dca.a(bnwVar.e), itm.e);
            bnwVar.f.Z(bnwVar, R.string.f161080_resource_name_obfuscated_res_0x7f14068c, R.string.f162700_resource_name_obfuscated_res_0x7f140730);
            bnwVar.c();
        }
        gxo.a(9).hQ(new bof(applicationContext, 0));
        cbd cbdVar = cbd.c;
        Resources resources2 = getResources();
        if (!cbdVar.g.getAndSet(true)) {
            cbdVar.d = R.raw.metadata;
            String[] stringArray = resources2.getStringArray(R.array.f1080_resource_name_obfuscated_res_0x7f030006);
            TypedArray obtainTypedArray = resources2.obtainTypedArray(R.array.f1090_resource_name_obfuscated_res_0x7f030007);
            int[] intArray = resources2.getIntArray(R.array.f1100_resource_name_obfuscated_res_0x7f030008);
            for (int i = 0; i < stringArray.length; i++) {
                int resourceId = obtainTypedArray.getResourceId(i, 0);
                if (resourceId == 0) {
                    ((ltd) cbd.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "setExternalRawResources", 431, "FileLocationUtils.java")).t("Could not get resource id");
                } else {
                    cbdVar.e.put(Locale.forLanguageTag(stringArray[i].replace('_', '-')), cbc.a(Integer.valueOf(resourceId), Integer.valueOf(intArray[i])));
                }
            }
            obtainTypedArray.recycle();
            cbdVar.f.countDown();
        }
        bze a3 = bzd.a(applicationContext);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jzc.i().c(new bzc(ieh.j()));
        bzr bzrVar = (bzr) a3;
        jzc.i().c(bzrVar.j);
        if (!((Boolean) bzr.b.c()).booleanValue()) {
            if (bzrVar.m == null) {
                bzrVar.m = new bvl(bzrVar, 3);
                bzr.b.e(bzrVar.m);
            }
        } else {
            bzrVar.r();
        }
        ieh.j().g(ddd.LATIN_APP_SETUP_SUPERPACKS, SystemClock.elapsedRealtime() - elapsedRealtime);
        dkc.b();
        ((hrx) hrx.y(this)).e.addIfAbsent(new bow(applicationContext));
        final boolean B = jam.B();
        if (B) {
            ieh.j().i = true;
        }
        gxo.a(9).hQ(new Callable() { // from class: bog
            /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:22:0x0007, B:7:0x0045, B:11:0x002c, B:14:0x0032, B:20:0x0043, B:26:0x0015, B:15:0x0033, B:17:0x0037, B:18:0x003e), top: B:2:0x0005, inners: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    r10 = this;
                    boj r0 = defpackage.boj.this
                    boolean r1 = r2
                    r2 = 0
                    if (r1 != 0) goto L28
                    iem r1 = new iem     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
                    android.content.Context r3 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
                    r1.<init>(r3)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
                    goto L29
                L11:
                    r0 = move-exception
                    goto L69
                L13:
                    r1 = move-exception
                    r9 = r1
                    ltg r1 = defpackage.boj.b     // Catch: java.lang.Throwable -> L11
                    ltv r3 = r1.d()     // Catch: java.lang.Throwable -> L11
                    java.lang.String r4 = "failed to create GoogleKeyboardClearcutAdapter"
                    java.lang.String r5 = "com/google/android/apps/inputmethod/latin/LatinApp"
                    java.lang.String r6 = "createClearcutAdapter"
                    r7 = 460(0x1cc, float:6.45E-43)
                    java.lang.String r8 = "LatinApp.java"
                    defpackage.f.h(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11
                L28:
                    r1 = r2
                L29:
                    if (r1 == 0) goto L2c
                    goto L45
                L2c:
                    iek r1 = defpackage.iek.a     // Catch: java.lang.Throwable -> L11
                    if (r1 != 0) goto L43
                    java.lang.Class<iek> r1 = defpackage.iek.class
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> L11
                    iek r3 = defpackage.iek.a     // Catch: java.lang.Throwable -> L40
                    if (r3 != 0) goto L3e
                    iek r3 = new iek     // Catch: java.lang.Throwable -> L40
                    r3.<init>()     // Catch: java.lang.Throwable -> L40
                    defpackage.iek.a = r3     // Catch: java.lang.Throwable -> L40
                L3e:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
                    goto L43
                L40:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
                    throw r0     // Catch: java.lang.Throwable -> L11
                L43:
                    iek r1 = defpackage.iek.a     // Catch: java.lang.Throwable -> L11
                L45:
                    bqv r3 = new bqv     // Catch: java.lang.Throwable -> L11
                    android.content.Context r4 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L11
                    r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L11
                    r0.c = r3     // Catch: java.lang.Throwable -> L11
                    bqv r0 = r0.c     // Catch: java.lang.Throwable -> L11
                    r0.e()     // Catch: java.lang.Throwable -> L11
                    ijl r0 = defpackage.ijl.b()     // Catch: java.lang.Throwable -> L11
                    ieb r3 = new ieb     // Catch: java.lang.Throwable -> L11
                    r3.<init>(r1)     // Catch: java.lang.Throwable -> L11
                    r0.g(r3)     // Catch: java.lang.Throwable -> L11
                    gyc r0 = defpackage.gyc.b     // Catch: java.lang.Throwable -> L11
                    bsd r1 = defpackage.bsd.o     // Catch: java.lang.Throwable -> L11
                    r0.execute(r1)     // Catch: java.lang.Throwable -> L11
                    return r2
                L69:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bog.call():java.lang.Object");
            }
        });
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    protected final void k() {
        ieh.j().q();
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    protected final void l() {
        qo qoVar = new qo();
        ihl.a(new String[]{"expressive_concepts"}, qoVar);
        ihl.a(new String[]{"expressive_concepts_blocklist"}, qoVar);
        ihl.a(new String[]{"mozc"}, qoVar);
        ihl.a(new String[]{"hmm", "gesture"}, qoVar);
        ihl.a(new String[]{"latin_handwriting"}, qoVar);
        ihl.a(new String[]{"handwriting"}, qoVar);
        ihl.a(new String[]{"neural_rescoring_model_packager_jni"}, qoVar);
        ihl.a(new String[]{"emoji"}, qoVar);
        ihl.a(new String[]{"google_speech_jni"}, qoVar);
        ihl.a(new String[]{"gboard_soda_jni"}, qoVar);
        ihl.a(new String[]{"jni_delight5decoder"}, qoVar);
        ihl.a(new String[]{"jni_webp"}, qoVar);
        ihl.a(new String[]{"sentence_explorer_jni"}, qoVar);
        ihl.a(new String[]{"native-materializer-jni"}, qoVar);
        ihl.a(new String[]{"input-metrics-jni"}, qoVar);
        NativeLibHelper.a = this;
        NativeLibHelper.b = llw.k(qoVar);
        NativeLibHelper.loadIntegratedSharedObjectLibrary(true);
        if (!jam.b) {
            NativeProfiler.initializeProfilingSignals(getApplicationContext());
        }
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/latin/LatinApp", "prepareNativeLibraries", 195, "LatinApp.java")).t("set BrellaInit fields for in-app training.");
        boe boeVar = (boe) a.a(new boh((Context) this, 1));
        synchronized (fwd.a) {
            jdg.u(boeVar);
            fwd.c = boeVar;
        }
        synchronized (fwd.a) {
            fwd.b = true;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    protected final bov m() {
        return new bov(getApplicationContext());
    }
}
