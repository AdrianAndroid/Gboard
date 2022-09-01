package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.apps.inputmethod.libs.framework.firstrun.PageIndicatorView;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ddi  reason: default package */
/* loaded from: classes.dex */
public abstract class ddi extends cx implements ty {
    public static final SparseArray l;
    private static final SparseIntArray v;
    public BidiViewPager m;
    public View n;
    public View o;
    public View p;
    public PageIndicatorView q;
    public int[] r = gvw.b;
    public String[] s = gvw.g;
    public int t = 0;
    private String w;
    public static final lug k = hin.a;
    private static final hsw u = new ddg();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        sparseIntArray.append(R.id.f66960_resource_name_obfuscated_res_0x7f0b0829, R.layout.f134640_resource_name_obfuscated_res_0x7f0e00b1);
        sparseIntArray.append(R.id.f66980_resource_name_obfuscated_res_0x7f0b082b, R.layout.f134700_resource_name_obfuscated_res_0x7f0e00b7);
        sparseIntArray.append(R.id.f66970_resource_name_obfuscated_res_0x7f0b082a, R.layout.f134690_resource_name_obfuscated_res_0x7f0e00b6);
        sparseIntArray.append(R.id.f66990_resource_name_obfuscated_res_0x7f0b082c, R.layout.f134710_resource_name_obfuscated_res_0x7f0e00b8);
        v = sparseIntArray;
        SparseArray sparseArray = new SparseArray(4);
        sparseArray.append(R.id.f66960_resource_name_obfuscated_res_0x7f0b0829, "first_run_page_enable");
        sparseArray.append(R.id.f66980_resource_name_obfuscated_res_0x7f0b082b, "first_run_page_select_input_method");
        sparseArray.append(R.id.f66970_resource_name_obfuscated_res_0x7f0b082a, "first_run_page_permission");
        sparseArray.append(R.id.f66990_resource_name_obfuscated_res_0x7f0b082c, "first_run_page_setup_user_metrics");
        l = sparseArray;
    }

    public static void o(Context context) {
        String packageName = context.getPackageName();
        int i = um.a;
        ((NotificationManager) context.getSystemService("notification")).cancel(packageName, 1);
    }

    protected abstract int l();

    protected abstract String m();

    public final int n(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.r;
            if (i2 < iArr.length) {
                if (iArr[i2] == v.get(i)) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TypedArray typedArray;
        super.onCreate(bundle);
        dcd.b(this);
        requestWindowFeature(1);
        setTitle("");
        setContentView(R.layout.f134620_resource_name_obfuscated_res_0x7f0e00af);
        this.w = getPackageName();
        this.s = ijt.e(this).p();
        try {
            typedArray = getResources().obtainTypedArray(l());
            try {
                int length = typedArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = typedArray.getResourceId(i, 0);
                }
                if (typedArray != null) {
                    typedArray.recycle();
                }
                this.r = iArr;
                if (iArr.length == 0) {
                    throw new lgj("First run activity should have at least one page.");
                }
                BidiViewPager bidiViewPager = (BidiViewPager) findViewById(R.id.f55450_resource_name_obfuscated_res_0x7f0b020a);
                this.m = bidiViewPager;
                if (bidiViewPager == null) {
                    ((luc) k.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/firstrun/FirstRunActivity", "onCreate", 208, "FirstRunActivity.java")).t("View with @id/first_run_pager doesn't exist");
                } else {
                    bidiViewPager.k(new ddh(this));
                }
                PageIndicatorView pageIndicatorView = (PageIndicatorView) findViewById(R.id.f67000_resource_name_obfuscated_res_0x7f0b082d);
                this.q = pageIndicatorView;
                if (pageIndicatorView != null) {
                    pageIndicatorView.b(this.r.length);
                    if (this.r.length == 1) {
                        this.q.setVisibility(8);
                    }
                }
                View findViewById = findViewById(R.id.f66160_resource_name_obfuscated_res_0x7f0b07c6);
                this.n = findViewById;
                if (findViewById != null) {
                    findViewById.setOnClickListener(new cjr(this, 8));
                }
                View findViewById2 = findViewById(R.id.f66150_resource_name_obfuscated_res_0x7f0b07c5);
                this.o = findViewById2;
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new cjr(this, 9));
                }
                View findViewById3 = findViewById(R.id.f66170_resource_name_obfuscated_res_0x7f0b07c7);
                this.p = findViewById3;
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(new cjr(this, 10));
                }
                jaq jaqVar = new jaq(this);
                jaq.e();
                if (!jaqVar.h()) {
                    this.t = n(R.id.f66960_resource_name_obfuscated_res_0x7f0b0829);
                } else if (!jaqVar.j()) {
                    this.t = n(R.id.f66980_resource_name_obfuscated_res_0x7f0b082b);
                } else {
                    this.t = n(R.id.f66980_resource_name_obfuscated_res_0x7f0b082b) + 1;
                }
                ieh.j().e(dda.SETUP_WIZARD_CREATED, m());
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    protected final void onDestroy() {
        int[] iArr = this.r;
        if (iArr != null) {
            String str = (String) l.get(iArr[this.t]);
            if (TextUtils.isEmpty(str)) {
                ((luc) ((luc) k.b()).k("com/google/android/apps/inputmethod/libs/framework/firstrun/FirstRunActivity", "onDestroy", 361, "FirstRunActivity.java")).u("Failed to find name for id: %s", this.r[this.t]);
            } else {
                ieh.j().e(dda.SETUP_WIZARD_PAGE_SHOWN, str);
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.ap, android.app.Activity
    protected final void onPause() {
        Notification notification;
        super.onPause();
        if (!dcd.e(this)) {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("com.google.android.apps.inputmethod.libs.framework.firstrun", getResources().getString(R.string.f152220_resource_name_obfuscated_res_0x7f140267), 3);
                int i = um.a;
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 26) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            PendingIntent activity = PendingIntent.getActivity(this, 0, dcd.a(this, getClass()), 201326592);
            if (activity != null) {
                uh uhVar = new uh(this, "com.google.android.apps.inputmethod.libs.framework.firstrun");
                uhVar.i(R.drawable.f49030_resource_name_obfuscated_res_0x7f08028b);
                uhVar.g(getResources().getText(R.string.ime_name));
                uhVar.f(getResources().getText(R.string.f152230_resource_name_obfuscated_res_0x7f140268));
                uhVar.e(true);
                uhVar.g = activity;
                notification = uhVar.a();
            } else {
                notification = null;
            }
            if (notification == null) {
                return;
            }
            int i2 = um.a;
            um.b(this.w, 1, notification, this, (NotificationManager) getSystemService("notification"));
            u.e(mjl.a);
        }
    }

    @Override // defpackage.ap, defpackage.ow, android.app.Activity, defpackage.ty
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ijt.e(this).j(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public void onResume() {
        super.onResume();
        o(this);
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    protected final void onStart() {
        super.onStart();
        ijt.e(this).h(this);
        p(this.t);
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    protected final void onStop() {
        ijt.e(this).i(this);
        BidiViewPager bidiViewPager = this.m;
        if (bidiViewPager != null) {
            this.t = bidiViewPager.a();
        }
        super.onStop();
    }

    public final void p(int i) {
        BidiViewPager bidiViewPager;
        if (i < 0 || i >= this.r.length || (bidiViewPager = this.m) == null) {
            return;
        }
        bidiViewPager.m(i, false);
    }
}
