package com.google.android.apps.inputmethod.latin.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.inputmethod.libs.theme.listing.preference.ThemeListingFragment;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SettingsActivity extends dxz {
    private static final llw p;

    static {
        lls i = llw.i(9);
        i.a(Integer.valueOf((int) R.id.f68390_resource_name_obfuscated_res_0x7f0b08e3), Integer.valueOf((int) R.string.f162410_resource_name_obfuscated_res_0x7f140712));
        i.a(Integer.valueOf((int) R.id.f68400_resource_name_obfuscated_res_0x7f0b08e4), Integer.valueOf((int) R.string.f162420_resource_name_obfuscated_res_0x7f140713));
        i.a(Integer.valueOf((int) R.id.f68420_resource_name_obfuscated_res_0x7f0b08e6), Integer.valueOf((int) R.string.f162460_resource_name_obfuscated_res_0x7f140717));
        i.a(Integer.valueOf((int) R.id.f68360_resource_name_obfuscated_res_0x7f0b08e0), Integer.valueOf((int) R.string.f162370_resource_name_obfuscated_res_0x7f14070e));
        i.a(Integer.valueOf((int) R.id.f68380_resource_name_obfuscated_res_0x7f0b08e2), Integer.valueOf((int) R.string.f162400_resource_name_obfuscated_res_0x7f140711));
        i.a(Integer.valueOf((int) R.id.f68430_resource_name_obfuscated_res_0x7f0b08e7), Integer.valueOf((int) R.string.f162480_resource_name_obfuscated_res_0x7f140719));
        i.a(Integer.valueOf((int) R.id.f68370_resource_name_obfuscated_res_0x7f0b08e1), Integer.valueOf((int) R.string.f162380_resource_name_obfuscated_res_0x7f14070f));
        i.a(Integer.valueOf((int) R.id.f68410_resource_name_obfuscated_res_0x7f0b08e5), Integer.valueOf((int) R.string.f162440_resource_name_obfuscated_res_0x7f140715));
        i.a(Integer.valueOf((int) R.id.f68350_resource_name_obfuscated_res_0x7f0b08df), Integer.valueOf((int) R.string.f162350_resource_name_obfuscated_res_0x7f14070c));
        p = i.l();
    }

    public static Intent m(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARGUMENT_EXIT_ON_APPLY", true);
        ins insVar = new ins(4);
        insVar.c(R.string.f165950_resource_name_obfuscated_res_0x7f1408a1);
        insVar.d(ThemeListingFragment.class.getName(), bundle);
        return insVar.setClassName(context, SettingsActivity.class.getName());
    }

    @Override // defpackage.gut, defpackage.guu
    public final int l() {
        return R.xml.settings;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.inx
    public final an n() {
        if (jez.e(this)) {
            return new brq();
        }
        return super.n();
    }

    @Override // defpackage.gut, defpackage.guu
    public final Integer o(int i) {
        return (Integer) p.get(Integer.valueOf(i));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ddc.e(getApplicationContext())) {
            new dqi(getApplicationContext()).c(getWindow(), getWindow().getDecorView().getWindowToken(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dxz, defpackage.inx, defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(":settings:fragment_args_key")) {
            ieh.j().e(dda.SETTINGS_ACTIVITY_CREATED, 10);
        }
        super.onCreate(bundle);
    }

    @Override // defpackage.dxz, defpackage.ow, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        ((dxz) this).k = menu;
        super.r();
        if (!hjk.a()) {
            menu.removeItem(R.id.f52140_resource_name_obfuscated_res_0x7f0b0056);
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [lgb, java.lang.Object] */
    @Override // defpackage.dxz, defpackage.gut, defpackage.ow, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.f52140_resource_name_obfuscated_res_0x7f0b0056) {
            String string = getString(R.string.f151850_resource_name_obfuscated_res_0x7f140240);
            GoogleHelp googleHelp = new GoogleHelp(18, "android_gboard", null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList());
            googleHelp.q = Uri.parse(string);
            ful a = hjg.j(getApplicationContext()).a();
            File cacheDir = getCacheDir();
            googleHelp.K = a.r;
            googleHelp.v = new ErrorReport(a, cacheDir);
            googleHelp.v.X = "GoogleHelp";
            Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
            ijk ijkVar = new ijk((Activity) this);
            if (!putExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") || !putExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
                throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
            }
            int b = fnn.b((Context) ijkVar.b, 11925000);
            if (b == 0) {
                Object a2 = ijkVar.a.a();
                fvl fvlVar = (fvl) a2;
                fyb.ax(fvlVar.a);
                fod fodVar = ((fnz) a2).h;
                fvg fvgVar = new fvg(fodVar, putExtra, new WeakReference(fvlVar.a));
                fodVar.a(fvgVar);
                fyb.aI(fvgVar);
            } else {
                Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) putExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
                if (b == 7) {
                    b = 7;
                } else if (!((Activity) ijkVar.b).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
                    new gco(Looper.getMainLooper()).post(new fso(ijkVar, data, 2, null, null, null));
                }
                Object obj = ijkVar.b;
                if (true == fnn.f((Context) obj, b)) {
                    b = 18;
                }
                fmx.a.d((Activity) obj, b, 0, null);
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dxz, defpackage.ap, android.app.Activity
    public final void onResume() {
        super.onResume();
        gqa.a(this).t(null, null);
    }

    @Override // defpackage.dxz
    public final void p(Collection collection) {
        Collections.addAll(collection, new brh(8), new brh(10), new brh(6), new brh(7), new brh(5), new bri(), new imy(), new brh(3), new brh(2), new brj(), new brh(0), new brh(4), new brh(9), new brh(1), new cmx(), new brn(), new brh(11), new brg(), new ina());
    }
}
