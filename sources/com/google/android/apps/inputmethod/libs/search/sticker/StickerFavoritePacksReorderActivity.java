package com.google.android.apps.inputmethod.libs.search.sticker;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StickerFavoritePacksReorderActivity extends gut implements ehe, agn {
    public cuj k;
    public ehf l;
    private final AtomicBoolean p = new AtomicBoolean(false);
    private ot q;

    @Override // defpackage.agn
    public final agm a(Class cls) {
        if (cls.isAssignableFrom(ehf.class)) {
            return (agm) cls.cast(new ehf(getApplication()));
        }
        throw new UnsupportedOperationException("Only favorite view model is supported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gut, defpackage.cx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        hqt b = hqp.b();
        if (b != null) {
            if (b.t()) {
                context = jbi.d(context, b.i());
            } else {
                context = jbi.e(context, b.i().C());
            }
        }
        super.attachBaseContext(context);
    }

    @Override // defpackage.agn
    public final /* synthetic */ agm b(Class cls) {
        return vg.c(this, cls);
    }

    @Override // defpackage.ehe
    public final /* synthetic */ EditorInfo c() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (EditorInfo) extras.getParcelable("EDITOR_INFO_EXTRA");
    }

    @Override // defpackage.ehe
    public final /* synthetic */ dba d() {
        return dba.a;
    }

    @Override // defpackage.ehe
    public final /* synthetic */ void e(igr igrVar) {
        IStickerExtension iStickerExtension = (IStickerExtension) igrVar.b(IStickerExtension.class);
        if (iStickerExtension == null) {
            ((ltd) ((ltd) ehd.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/ExpressiveActivityMixin", "tryOpenKeyboardToStickersInternal", 74, "ExpressiveActivityMixin.java")).t("tryOpenKeyboardToStickers(): extension is null");
        } else if (!iStickerExtension.f(c(), d())) {
            ((ltd) ((ltd) ehd.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/ExpressiveActivityMixin", "tryOpenKeyboardToStickersInternal", 71, "ExpressiveActivityMixin.java")).t("tryOpenKeyboardToStickers(): failed to register listener");
        }
        hsv.b();
    }

    @Override // defpackage.gut, defpackage.ow, android.app.Activity
    public final void onBackPressed() {
        this.p.set(true);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object findViewById;
        super.onCreate(bundle);
        setContentView(R.layout.f146590_resource_name_obfuscated_res_0x7f0e05d1);
        this.q = new ot(new eia(new dzk(this, 20)));
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = tx.a(this, R.id.f55240_resource_name_obfuscated_res_0x7f0b01f5);
        } else {
            findViewById = findViewById(R.id.f55240_resource_name_obfuscated_res_0x7f0b01f5);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) findViewById;
        lls h = llw.h();
        h.a(cxc.class, ejj.b(this.q));
        this.k = cnx.f(h, this, this.q, LayoutInflater.from(this));
        getApplicationContext();
        bindingRecyclerView.ab(new LinearLayoutManager());
        bindingRecyclerView.aa(this.k);
        hqs.f(bindingRecyclerView, this);
        aqr at = at();
        oll.e(at, "store");
        agr agrVar = agr.a;
        oll.e(at, "store");
        oll.e(agrVar, "defaultCreationExtras");
        this.l = (ehf) vh.b(ehf.class, at, this, agrVar);
        ldu lduVar = ldu.a;
        css cssVar = new css(lfb.g(new ehz(this, 0)), lduVar, lduVar);
        ehf ehfVar = this.l;
        if (!ehfVar.a.k.get()) {
            csu csuVar = ehfVar.a;
            hiz i = hiz.k(ehfVar.b.k(1)).i();
            dpe dpeVar = ehfVar.c;
            Objects.requireNonNull(dpeVar);
            hiz u = i.u(new ebi(dpeVar, 3, null, null), mjl.a);
            csuVar.k.set(true);
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new bxj(csuVar, 12));
            e2.h(new bxj(csuVar, 13));
            e3.h(new bxj(csuVar, 14));
            hix a = hjg.a(mjl.a, null, afpVar, z, e, e2, e3);
            Pair pair = (Pair) csuVar.j.getAndSet(Pair.create(u, a));
            if (csuVar.l) {
                csu.j(pair);
            } else {
                csu.k(pair);
            }
            a.c(u);
        }
        ehfVar.a.l(this, cssVar);
        setTitle(R.string.f162930_resource_name_obfuscated_res_0x7f14074f);
        Toolbar toolbar = this.m;
        if (toolbar != null) {
            toolbar.o(ej.a(toolbar.getContext(), R.drawable.f50170_resource_name_obfuscated_res_0x7f080334));
            toolbar.m(R.string.f167130_resource_name_obfuscated_res_0x7f140929);
        }
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.ap, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.p.getAndSet(false)) {
            Context applicationContext = getApplicationContext();
            if (hsx.b() == null) {
                ((ltd) ((ltd) ehd.a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/ExpressiveActivityMixin", "tryOpenKeyboardToStickers", 61, "ExpressiveActivityMixin.java")).t("tryOpenKeyboardToStickers(): service is null");
            } else {
                e(igr.d(applicationContext));
            }
        }
    }
}
