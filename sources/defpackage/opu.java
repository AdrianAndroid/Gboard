package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler;
import com.google.android.apps.inputmethod.libs.hint.CentralizedHintManager;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;
import com.google.android.libraries.inputmethod.accesspoint.impl.AccessPointDragPopupView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.widget.PageableEmojiListHolderView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Closeable;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: opu  reason: default package */
/* loaded from: classes2.dex */
public final class opu {
    public final /* synthetic */ Object a;

    public opu() {
    }

    public opu(ade adeVar) {
        this.a = adeVar;
    }

    public opu(adl adlVar) {
        this.a = adlVar;
    }

    public opu(agi agiVar) {
        this.a = agiVar;
    }

    public opu(Context context, byte[] bArr) {
        this.a = context;
    }

    public /* synthetic */ opu(Resources resources) {
        this.a = resources;
    }

    public opu(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public opu(Toolbar toolbar) {
        this.a = toolbar;
    }

    public /* synthetic */ opu(View view) {
        this.a = view;
    }

    public opu(boa boaVar) {
        this.a = boaVar;
    }

    public /* synthetic */ opu(bwz bwzVar) {
        this.a = bwzVar;
    }

    public /* synthetic */ opu(LatinPrimeKeyboard latinPrimeKeyboard) {
        this.a = latinPrimeKeyboard;
    }

    public opu(Delight5Facilitator delight5Facilitator) {
        this.a = delight5Facilitator;
    }

    public /* synthetic */ opu(Delight5Facilitator delight5Facilitator, byte[] bArr) {
        this.a = delight5Facilitator;
    }

    public opu(HandwritingMotionEventHandler handwritingMotionEventHandler) {
        this.a = handwritingMotionEventHandler;
    }

    public /* synthetic */ opu(CentralizedHintManager centralizedHintManager) {
        this.a = centralizedHintManager;
    }

    public /* synthetic */ opu(InAppTrainingServiceImpl inAppTrainingServiceImpl) {
        this.a = inAppTrainingServiceImpl;
    }

    public /* synthetic */ opu(EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView) {
        this.a = emojiPickerBodyRecyclerView;
    }

    public /* synthetic */ opu(PageableEmojiListHolderView pageableEmojiListHolderView) {
        this.a = pageableEmojiListHolderView;
    }

    public opu(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    public opu(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public /* synthetic */ opu(dbv dbvVar) {
        this.a = dbvVar;
    }

    public /* synthetic */ opu(dcu dcuVar) {
        this.a = dcuVar;
    }

    public opu(dr drVar) {
        this.a = drVar;
    }

    public /* synthetic */ opu(eay eayVar, byte[] bArr) {
        this.a = eayVar;
    }

    public opu(eb ebVar) {
        this.a = ebVar;
    }

    public opu(eh ehVar) {
        this.a = ehVar;
    }

    public /* synthetic */ opu(esg esgVar) {
        this.a = esgVar;
    }

    public opu(ezx ezxVar) {
        this.a = ezxVar;
    }

    public opu(fby fbyVar) {
        this.a = fbyVar;
    }

    public /* synthetic */ opu(fgc fgcVar) {
        this.a = fgcVar;
    }

    public opu(fpb fpbVar) {
        this.a = fpbVar;
    }

    public opu(fpg fpgVar) {
        this.a = fpgVar;
    }

    public opu(fpw fpwVar) {
        this.a = fpwVar;
    }

    public opu(fpy fpyVar) {
        this.a = fpyVar;
    }

    public /* synthetic */ opu(gla glaVar) {
        this.a = glaVar;
    }

    public opu(gmo gmoVar) {
        this.a = gmoVar;
    }

    public opu(go goVar) {
        this.a = goVar;
    }

    public /* synthetic */ opu(gtj gtjVar) {
        this.a = gtjVar;
    }

    public /* synthetic */ opu(hci hciVar) {
        this.a = hciVar;
    }

    public /* synthetic */ opu(hiv hivVar) {
        this.a = hivVar;
    }

    public opu(hpx hpxVar) {
        this.a = hpxVar;
    }

    public opu(hs hsVar) {
        this.a = hsVar;
    }

    public opu(hyx hyxVar) {
        this.a = hyxVar;
    }

    public opu(ieh iehVar) {
        this.a = iehVar;
    }

    public /* synthetic */ opu(ilu iluVar) {
        this.a = iluVar;
    }

    public /* synthetic */ opu(Locale locale) {
        this.a = locale;
    }

    public /* synthetic */ opu(Pattern pattern) {
        this.a = pattern;
    }

    public /* synthetic */ opu(jqx jqxVar) {
        this.a = jqxVar;
    }

    public opu(jvr jvrVar) {
        this.a = jvrVar;
    }

    public opu(jxn jxnVar) {
        this.a = jxnVar;
    }

    public /* synthetic */ opu(kkl kklVar) {
        this.a = kklVar;
    }

    public /* synthetic */ opu(kqk kqkVar) {
        this.a = kqkVar;
    }

    public opu(kqr kqrVar) {
        this.a = kqrVar;
    }

    public opu(krj krjVar) {
        this.a = krjVar;
    }

    public /* synthetic */ opu(krr krrVar) {
        this.a = krrVar;
    }

    public opu(kxe kxeVar) {
        this.a = kxeVar;
    }

    public opu(kye kyeVar) {
        this.a = kyeVar;
    }

    public opu(kzz kzzVar) {
        this.a = kzzVar;
    }

    public opu(lbi lbiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = lbiVar;
    }

    public /* synthetic */ opu(llw llwVar) {
        this.a = llwVar;
    }

    public /* synthetic */ opu(mmk mmkVar) {
        this.a = mmkVar;
    }

    public opu(oce oceVar) {
        this.a = oceVar;
    }

    public opu(oeu oeuVar) {
        this.a = oeuVar;
    }

    public opu(ogc ogcVar) {
        this.a = ogcVar;
    }

    public opu(opc opcVar) {
        this.a = opcVar;
    }

    public opu(opv opvVar) {
        this.a = opvVar;
    }

    public /* synthetic */ opu(Closeable[] closeableArr) {
        this.a = closeableArr;
    }

    public final void A(int i, int i2) {
        ((RecyclerView) this.a).O(i, i2, true);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.K = true;
        recyclerView.J.c += i2;
    }

    public final int B() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int C(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View D(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void E(View view) {
        mo j = RecyclerView.j(view);
        if (j != null) {
            ((RecyclerView) this.a).as(j, j.o);
            j.o = 0;
        }
    }

    public final void F(int i) {
        View childAt = ((RecyclerView) this.a).getChildAt(i);
        if (childAt != null) {
            ((RecyclerView) this.a).gL(childAt);
            childAt.clearAnimation();
        }
        ((RecyclerView) this.a).removeViewAt(i);
    }

    public final void G(mo moVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aT(moVar.a, recyclerView.e);
    }

    public final void H(mo moVar, yx yxVar, yx yxVar2) {
        int i;
        int i2;
        Object obj = this.a;
        moVar.n(false);
        RecyclerView recyclerView = (RecyclerView) obj;
        lv lvVar = recyclerView.B;
        if (yxVar != null && ((i = yxVar.b) != (i2 = yxVar2.b) || yxVar.a != yxVar2.a)) {
            if (!lvVar.h(moVar, i, yxVar.a, i2, yxVar2.a)) {
                return;
            }
        } else {
            lvVar.g(moVar);
            moVar.a.setAlpha(0.0f);
            lvVar.b.add(moVar);
        }
        recyclerView.S();
    }

    public final void I(mo moVar, yx yxVar, yx yxVar2) {
        int i;
        int i2;
        ((RecyclerView) this.a).e.n(moVar);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.gF(moVar);
        moVar.n(false);
        lv lvVar = recyclerView.B;
        int i3 = yxVar.b;
        int i4 = yxVar.a;
        View view = moVar.a;
        if (yxVar2 == null) {
            i = view.getLeft();
        } else {
            i = yxVar2.b;
        }
        int i5 = i;
        if (yxVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = yxVar2.a;
        }
        int i6 = i2;
        if (!moVar.v() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            if (!lvVar.h(moVar, i3, i4, i5, i6)) {
                return;
            }
        } else {
            lvVar.g(moVar);
            lvVar.a.add(moVar);
        }
        recyclerView.S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, aca] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Parcelable, java.lang.Object] */
    public final boolean J(aqq aqqVar, int i, Bundle bundle) {
        yg ygVar;
        Object obj = this.a;
        Bundle bundle2 = bundle;
        if (Build.VERSION.SDK_INT >= 25) {
            bundle2 = bundle;
            if ((i & 1) != 0) {
                try {
                    aqqVar.a.e();
                    ?? h = aqqVar.h();
                    Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", h);
                    bundle2 = bundle3;
                } catch (Exception e) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
        }
        ClipData clipData = new ClipData(aqqVar.e(), new ClipData.Item(aqqVar.f()));
        if (Build.VERSION.SDK_INT >= 31) {
            ygVar = new yf(clipData, 2);
        } else {
            ygVar = new yh(clipData, 2);
        }
        ygVar.d(aqqVar.g());
        ygVar.b(bundle2);
        return aad.s((View) obj, oc.b(ygVar)) == null;
    }

    public final nyx a(ntx ntxVar) {
        nua nuaVar = ((oce) this.a).s;
        if (((oce) this.a).z.get()) {
            return ((oce) this.a).x;
        }
        if (nuaVar == null) {
            ((oce) this.a).m.execute(new nzp(this, 19, null, null));
            return ((oce) this.a).x;
        }
        nyx b = oao.b(nuaVar.a(), ntxVar.a.f());
        return b != null ? b : ((oce) this.a).x;
    }

    public final void b(boolean z) {
        Object obj = this.a;
        if (!z) {
            ((moe) ((mmk) obj).f.a()).a();
        }
    }

    public final void c(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((kye) this.a).e(0);
    }

    public final void d(Drawable drawable) {
        if (drawable != null) {
            FloatingActionButton.c((FloatingActionButton) this.a, drawable);
        }
    }

    public final boolean e() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void f() {
        Object obj;
        synchronized (((krj) this.a).i) {
            int i = ((krj) this.a).l;
            jdg.H(i > 0, "Refcount went negative!", i);
            ((krj) obj).l--;
            ((krj) this.a).d();
        }
    }

    public final jrp g(String str) {
        jrp jrpVar = (jrp) ((jxn) this.a).j.get(str);
        return jrpVar == null ? jrp.a : jrpVar;
    }

    public final Iterable h() {
        jso jsoVar;
        synchronized (this.a) {
            jsoVar = ((jxn) this.a).b;
        }
        return jsoVar;
    }

    public final Iterable i() {
        jso jsoVar;
        synchronized (this.a) {
            jsoVar = ((jxn) this.a).c;
        }
        return jsoVar;
    }

    public final Iterable j() {
        jso jsoVar;
        synchronized (this.a) {
            jsoVar = ((jxn) this.a).e;
        }
        return jsoVar;
    }

    public final mko k() {
        return ((kqr) this.a).a();
    }

    public final void l(int i) {
        ((hrx) ((eay) this.a).a).v(i);
    }

    public final int m(int i) {
        mko hQ;
        hpx hpxVar = (hpx) this.a;
        if (hpxVar.g != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            hpr hprVar = hpxVar.g;
            InputConnection a = hprVar.a();
            if (a == null) {
                hQ = kcu.K(null);
            } else {
                hQ = hprVar.g.hQ(new hmc(a, i, 2));
            }
            Integer num = (Integer) hpx.g(hQ, 0, false, hpxVar.h, 5);
            hpx.l(hpxVar.h, hpv.IC_GET_CURSOR_CAPS_MODE, SystemClock.uptimeMillis() - uptimeMillis);
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public final hqk n(int i, int i2, int i3) {
        mko hQ;
        hpx hpxVar = (hpx) this.a;
        if (hpxVar.g == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        hpr hprVar = hpxVar.g;
        InputConnection a = hprVar.a();
        if (a == null) {
            hQ = kcu.K(null);
        } else if (Build.VERSION.SDK_INT >= 31) {
            hQ = hprVar.g.hQ(new hpo(a, i, i2, i3, 0));
        } else {
            hQ = hprVar.g.hQ(new hpo(i, a, i3, i2, 2));
        }
        hqk hqkVar = (hqk) hpxVar.w(hQ, hpxVar.h, 6);
        hpx.l(hpxVar.h, hpv.IC_GET_SURROUNDING_TEXT, SystemClock.uptimeMillis() - uptimeMillis);
        return hqkVar;
    }

    public final CharSequence o(int i) {
        mko hQ;
        hpx hpxVar = (hpx) this.a;
        hpr hprVar = hpxVar.g;
        if (hprVar == null) {
            return null;
        }
        InputConnection a = hprVar.a();
        if (a == null) {
            hQ = kcu.K(null);
        } else {
            hQ = hprVar.g.hQ(new hmc(a, i, 5));
        }
        return (CharSequence) hpxVar.w(hQ, hpxVar.h, 4);
    }

    public final CharSequence p(int i, int i2) {
        mko hQ;
        hpx hpxVar = (hpx) this.a;
        if (hpxVar.g == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        hpr hprVar = hpxVar.g;
        InputConnection a = hprVar.a();
        if (a == null) {
            hQ = kcu.K(null);
        } else {
            hQ = hprVar.g.hQ(new hpp(a, i, i2, 0));
        }
        CharSequence charSequence = (CharSequence) hpxVar.w(hQ, hpxVar.h, 3);
        hpx.l(hpxVar.h, hpv.IC_GET_TEXT_AFTER_CURSOR, SystemClock.uptimeMillis() - uptimeMillis);
        return charSequence;
    }

    public final CharSequence q(int i, int i2) {
        mko hQ;
        hpx hpxVar = (hpx) this.a;
        if (hpxVar.g == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        hpr hprVar = hpxVar.g;
        InputConnection a = hprVar.a();
        if (a == null) {
            hQ = kcu.K(null);
        } else {
            hQ = hprVar.g.hQ(new hpp(a, i, i2, 1));
        }
        CharSequence charSequence = (CharSequence) hpxVar.w(hQ, hpxVar.h, 1);
        hpx.l(hpxVar.h, hpv.IC_GET_TEXT_BEFORE_CURSOR, SystemClock.uptimeMillis() - uptimeMillis);
        return charSequence;
    }

    public final void r(View view) {
        AccessPointDragPopupView accessPointDragPopupView = ((gtj) this.a).a;
        if (accessPointDragPopupView != null) {
            accessPointDragPopupView.removeView(view);
            accessPointDragPopupView.b.push(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fpw] */
    public final void s(fmt fmtVar) {
        this.a.i(fmtVar);
    }

    public final void t() {
        ((fby) this.a).h(fff.USER_TERMINATED);
    }

    public final void u(mko mkoVar, iav iavVar, hqt hqtVar) {
        LatinPrimeKeyboard latinPrimeKeyboard = (LatinPrimeKeyboard) this.a;
        if (!mkoVar.equals(latinPrimeKeyboard.e.get(hqtVar.i())) || iavVar == null) {
            return;
        }
        if (iavVar.f.c(ibz.a)) {
            Context a = hqtVar.a();
            ibu.a(latinPrimeKeyboard.u).c(a, latinPrimeKeyboard.g, gvv.c(a), ((ess) latinPrimeKeyboard.v.t()).a, hqtVar.c(latinPrimeKeyboard.v.b()), iavVar.f, ibz.a);
        }
        latinPrimeKeyboard.e.remove(hqtVar.i());
    }

    public final mo v(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i2 = 0;
        mo moVar = null;
        while (true) {
            if (i2 >= c) {
                break;
            }
            mo j = RecyclerView.j(recyclerView.h.f(i2));
            if (j != null && !j.v() && j.c == i) {
                if (!recyclerView.h.k(j.a)) {
                    moVar = j;
                    break;
                }
                moVar = j;
            }
            i2++;
        }
        if (moVar != null && !((RecyclerView) this.a).h.k(moVar.a)) {
            return moVar;
        }
        return null;
    }

    public final void w(hx hxVar) {
        int i = hxVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).m.A(hxVar.b, hxVar.d);
        } else if (i == 2) {
            ((RecyclerView) this.a).m.D(hxVar.b, hxVar.d);
        } else if (i != 4) {
            if (i != 8) {
                return;
            }
            ((RecyclerView) this.a).m.C(hxVar.b, hxVar.d);
        } else {
            ly lyVar = ((RecyclerView) this.a).m;
            int i2 = hxVar.b;
            int i3 = hxVar.d;
            Object obj = hxVar.c;
            lyVar.E(i2, i3);
        }
    }

    public final void x(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < c; i6++) {
            View f = recyclerView.h.f(i6);
            mo j = RecyclerView.j(f);
            if (j != null && !j.A() && (i4 = j.c) >= i && i4 < i5) {
                j.f(2);
                j.e(obj);
                ((lz) f.getLayoutParams()).e = true;
            }
        }
        me meVar = recyclerView.e;
        int size = meVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                ((RecyclerView) this.a).L = true;
                return;
            }
            mo moVar = (mo) meVar.c.get(size);
            if (moVar != null && (i3 = moVar.c) >= i && i3 < i5) {
                moVar.f(2);
                meVar.j(size);
            }
        }
    }

    public final void y(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        for (int i3 = 0; i3 < c; i3++) {
            mo j = RecyclerView.j(recyclerView.h.f(i3));
            if (j != null && !j.A() && j.c >= i) {
                j.k(i2, false);
                recyclerView.J.f = true;
            }
        }
        me meVar = recyclerView.e;
        int size = meVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            mo moVar = (mo) meVar.c.get(i4);
            if (moVar != null && moVar.c >= i) {
                moVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).K = true;
    }

    public final void z(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i5 = -1;
        int i6 = i < i2 ? -1 : 1;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        for (int i9 = 0; i9 < c; i9++) {
            mo j = RecyclerView.j(recyclerView.h.f(i9));
            if (j != null && (i4 = j.c) >= i8 && i4 <= i7) {
                if (i4 == i) {
                    j.k(i2 - i, false);
                } else {
                    j.k(i6, false);
                }
                recyclerView.J.f = true;
            }
        }
        me meVar = recyclerView.e;
        if (i >= i2) {
            i5 = 1;
        }
        int size = meVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo moVar = (mo) meVar.c.get(i10);
            if (moVar != null && (i3 = moVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    moVar.k(i2 - i, false);
                } else {
                    moVar.k(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).K = true;
    }
}
