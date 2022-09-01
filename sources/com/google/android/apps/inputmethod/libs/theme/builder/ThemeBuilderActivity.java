package com.google.android.apps.inputmethod.libs.theme.builder;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThemeBuilderActivity extends epk {
    public static final ltg m = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity");
    private final gwa n = new gwa();
    private Uri o;
    private int p;

    private final void A() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException e) {
            ((ltd) ((ltd) ((ltd) m.c()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity", "requestImportImage", 'R', "ThemeBuilderActivity.java")).t("There is no application to handle this intent.");
            x();
        }
    }

    public static mkr t() {
        return gxo.a(1);
    }

    @Override // defpackage.epk
    protected final ept l(epw epwVar) {
        return new ept(this, this, epwVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1 || i2 != -1 || intent == null || intent.getData() == null) {
            w();
            return;
        }
        Uri data = intent.getData();
        this.o = data;
        if (data == null) {
            return;
        }
        if (checkUriPermission(data, Binder.getCallingPid(), Binder.getCallingUid(), 1) != 0) {
            int i3 = this.p;
            String[] strArr = {ijw.a()};
            ArrayList A = lre.A();
            if (ijw.d(this, strArr, A)) {
                ijw.b(this, i3, A);
                return;
            }
        }
        z();
    }

    @Override // defpackage.epk, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = ijt.e(this).a();
        if (bundle == null) {
            A();
            return;
        }
        File u = u();
        if (!u.canRead()) {
            ((ltd) ((ltd) m.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity", "onCreate", 69, "ThemeBuilderActivity.java")).t("Failed to load an image.");
            w();
            return;
        }
        y(lwm.f(u));
    }

    @Override // defpackage.ap, defpackage.ow, android.app.Activity, defpackage.ty
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != this.p) {
            ((ltd) ((ltd) m.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity", "onRequestPermissionsResult", 112, "ThemeBuilderActivity.java")).u("Invalid permission request code: %d", i);
            w();
            return;
        }
        getClass().getSimpleName();
        ijw.e(strArr, iArr);
        for (int i2 : iArr) {
            if (i2 != 0) {
                Toast.makeText(this, (int) R.string.f176290_resource_name_obfuscated_res_0x7f140cc4, 0).show();
                w();
                return;
            }
        }
        z();
    }

    @Override // defpackage.epk
    protected final void q() {
        setRequestedOrientation(this.l);
        A();
    }

    @Override // defpackage.epk
    protected final void r() {
        File c;
        if (getIntent().getBooleanExtra("intent_extra_key_is_cross_profile", false)) {
            c = erj.m(this, "cross_profile_temp_user_theme_");
        } else {
            c = erj.c(this);
        }
        epw m2 = m();
        if (m2 == null || c == null) {
            w();
        } else {
            t().hP(new epv(this, m2, c, 1));
        }
    }

    public final File u() {
        return new File(((gwj) this.n.a(new drf(this, 19))).b, "new_image_cache");
    }

    public final void v() {
        u().delete();
    }

    public final void w() {
        setResult(0);
        v();
        finish();
    }

    public final void x() {
        Toast.makeText(this, getResources().getString(R.string.f176280_resource_name_obfuscated_res_0x7f140cc3), 1).show();
        w();
    }

    public final void y(lym lymVar) {
        String str;
        o();
        epw epwVar = new epw(lymVar);
        File[] a = evf.a(this);
        HashSet hashSet = new HashSet(a.length);
        for (File file : a) {
            erv b = erv.b(this, file);
            if (b != null) {
                hashSet.add(b.a.e);
            }
        }
        Locale locale = getResources().getConfiguration().locale;
        String format = DateFormat.getDateInstance(2, locale).format(new Date());
        String string = getString(R.string.f182210_resource_name_obfuscated_res_0x7f140f30);
        int i = 1;
        while (true) {
            if (i > 1000) {
                str = "";
                break;
            }
            str = String.format(locale, string, Integer.valueOf(i), format);
            if (!hashSet.contains(str)) {
                break;
            }
            i++;
        }
        epwVar.i = str;
        s(epwVar);
    }

    final void z() {
        hjq.a(this).b().f(this.o).n(new beu().H(512, 512)).e(new epl(this)).p();
    }
}
