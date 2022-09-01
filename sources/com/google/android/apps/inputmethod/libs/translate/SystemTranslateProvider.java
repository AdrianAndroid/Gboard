package com.google.android.apps.inputmethod.libs.translate;

import android.content.Context;
import android.text.TextUtils;
import android.view.translation.TranslationManager;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemTranslateProvider implements eyn {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/translate/SystemTranslateProvider");
    public static final ezr b = new ezr(5);
    public static final ezr c = new ezr(2);
    public final Context d;
    public final TranslationManager e;
    private mko i;
    public rj translatorCompleter;
    private volatile String g = "";
    private volatile String h = "";
    public final mkr f = gxo.a(6);

    public SystemTranslateProvider(Context context) {
        this.d = context;
        this.e = (TranslationManager) context.getSystemService("translation");
    }

    public static void e(eym eymVar, ezr ezrVar) {
        gyc.b.execute(new elr(eymVar, ezrVar, 10));
    }

    @Override // defpackage.eyn
    public final void a(Locale locale, eyl eylVar) {
        if (eylVar == null) {
            return;
        }
        if (this.e != null) {
            this.f.execute(new epv(this, eylVar, locale, 3));
            return;
        }
        llw llwVar = lrq.b;
        eylVar.a(llwVar, llwVar);
    }

    @Override // defpackage.eyn
    public final void b() {
    }

    @Override // defpackage.eyn
    public final void c() {
        this.i = null;
        this.translatorCompleter = null;
        this.g = "";
        this.h = "";
    }

    @Override // defpackage.eyn
    public final void d(ezq ezqVar, eym eymVar) {
        mko b2;
        if (this.e == null) {
            eymVar.a(b);
            return;
        }
        String str = ezqVar.b;
        String str2 = ezqVar.c;
        if (true == str2.equals("zh-CN")) {
            str2 = "zh";
        }
        if (this.i == null || !TextUtils.equals(this.g, str) || !TextUtils.equals(this.h, str2)) {
            this.g = str;
            this.h = str2;
            b2 = iq.b(new iis(this, str, str2, 1));
            this.i = b2;
        } else {
            b2 = this.i;
        }
        kcu.U(mio.g(mkh.q(b2), new crj(this, eymVar, ezqVar, 7), this.f), new fkb(eymVar, 1), gyc.b);
    }

    @Override // defpackage.eyn
    public final /* synthetic */ boolean f(String str, String str2) {
        return false;
    }
}
