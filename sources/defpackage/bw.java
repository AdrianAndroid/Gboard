package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinPageableCandidatesHolderView;
import com.google.android.apps.inputmethod.latin.preference.VoiceSettingsFragment;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bw  reason: default package */
/* loaded from: classes.dex */
public final class bw implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bw(adv advVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.b = advVar;
        this.a = opuVar;
    }

    public bw(ahe aheVar, Object obj, int i) {
        this.c = i;
        this.a = aheVar;
        this.b = obj;
    }

    public bw(Application application, ua uaVar, int i) {
        this.c = i;
        this.a = application;
        this.b = uaVar;
    }

    public bw(aqq aqqVar, Typeface typeface, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.b = aqqVar;
        this.a = typeface;
    }

    public bw(ayo ayoVar, Runnable runnable, int i) {
        this.c = i;
        this.a = ayoVar;
        this.b = runnable;
    }

    public bw(bdf bdfVar, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.c = i;
        this.b = bdfVar;
        this.a = onDrawListener;
    }

    public bw(ca caVar, bx bxVar, int i) {
        this.c = i;
        this.b = caVar;
        this.a = bxVar;
    }

    public bw(LatinPageableCandidatesHolderView latinPageableCandidatesHolderView, dee deeVar, int i) {
        this.c = i;
        this.a = latinPageableCandidatesHolderView;
        this.b = deeVar;
    }

    public /* synthetic */ bw(VoiceSettingsFragment voiceSettingsFragment, dxs dxsVar, int i, byte[] bArr) {
        this.c = i;
        this.a = voiceSettingsFragment;
        this.b = dxsVar;
    }

    public /* synthetic */ bw(dx dxVar, Runnable runnable, int i) {
        this.c = i;
        this.a = dxVar;
        this.b = runnable;
    }

    public bw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bw(String str, aff affVar, int i) {
        this.c = i;
        this.b = str;
        this.a = affVar;
    }

    public bw(List list, bz bzVar, int i) {
        this.c = i;
        this.b = list;
        this.a = bzVar;
    }

    public bw(lv lvVar, ArrayList arrayList, int i) {
        this.c = i;
        this.a = lvVar;
        this.b = arrayList;
    }

    public bw(ot otVar, oq oqVar, int i) {
        this.c = i;
        this.b = otVar;
        this.a = oqVar;
    }

    public bw(ua uaVar, Object obj, int i) {
        this.c = i;
        this.a = uaVar;
        this.b = obj;
    }

    public /* synthetic */ bw(vj vjVar, Typeface typeface, int i) {
        this.c = i;
        this.b = vjVar;
        this.a = typeface;
    }

    public bw(xt xtVar, Object obj, int i) {
        this.c = i;
        this.a = xtVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, xt] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, android.view.ViewTreeObserver$OnDrawListener] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, dup] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.c) {
            case 0:
                if (!((ca) this.b).b.contains(this.a)) {
                    return;
                }
                bz bzVar = (bz) this.a;
                cd.t(bzVar.e, bzVar.a.O);
                return;
            case 1:
                if (!this.b.contains(this.a)) {
                    return;
                }
                this.b.remove(this.a);
                ca.f((bz) this.a);
                return;
            case 2:
                ((ca) this.b).b.remove(this.a);
                ((ca) this.b).c.remove(this.a);
                return;
            case 3:
                Object obj = this.a;
                try {
                    this.b.run();
                    return;
                } finally {
                    ((dx) obj).a();
                }
            case 4:
                ?? r0 = this.b;
                int size = r0.size();
                while (i < size) {
                    ka kaVar = (ka) r0.get(i);
                    Object obj2 = this.a;
                    mo moVar = kaVar.a;
                    int i2 = kaVar.b;
                    int i3 = kaVar.c;
                    int i4 = kaVar.d;
                    int i5 = kaVar.e;
                    View view = moVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    lv lvVar = (lv) obj2;
                    lvVar.i.add(moVar);
                    animate.setDuration(250L).setListener(new jw(lvVar, moVar, i6, view, i7, animate)).start();
                    i++;
                }
                ((ArrayList) this.b).clear();
                ((lv) this.a).f.remove(this.b);
                return;
            case 5:
                ?? r02 = this.b;
                int size2 = r02.size();
                while (i < size2) {
                    jz jzVar = (jz) r02.get(i);
                    Object obj3 = this.a;
                    mo moVar2 = jzVar.a;
                    View view2 = null;
                    View view3 = moVar2 == null ? null : moVar2.a;
                    mo moVar3 = jzVar.b;
                    if (moVar3 != null) {
                        view2 = moVar3.a;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator duration = view3.animate().setDuration(250L);
                        lv lvVar2 = (lv) obj3;
                        lvVar2.k.add(jzVar.a);
                        duration.translationX(jzVar.e - jzVar.c);
                        duration.translationY(jzVar.f - jzVar.d);
                        duration.alpha(0.0f).setListener(new jx(lvVar2, jzVar, duration, view3)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        lv lvVar3 = (lv) obj3;
                        lvVar3.k.add(jzVar.b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new jy(lvVar3, jzVar, animate2, view2)).start();
                    }
                    i++;
                }
                ((ArrayList) this.b).clear();
                ((lv) this.a).g.remove(this.b);
                return;
            case 6:
                ?? r03 = this.b;
                int size3 = r03.size();
                while (i < size3) {
                    mo moVar4 = (mo) r03.get(i);
                    Object obj4 = this.a;
                    View view4 = moVar4.a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    lv lvVar4 = (lv) obj4;
                    lvVar4.h.add(moVar4);
                    animate3.alpha(1.0f).setDuration(120L).setListener(new jv(lvVar4, moVar4, view4, animate3)).start();
                    i++;
                }
                ((ArrayList) this.b).clear();
                ((lv) this.a).e.remove(this.b);
                return;
            case 7:
                RecyclerView recyclerView = ((ot) this.b).m;
                if (recyclerView == null || !recyclerView.p) {
                    return;
                }
                oq oqVar = (oq) this.a;
                if (oqVar.n || oqVar.h.a() == -1) {
                    return;
                }
                lv lvVar5 = ((ot) this.b).m.B;
                if (lvVar5 == null || !lvVar5.i()) {
                    ot otVar = (ot) this.b;
                    int size4 = otVar.l.size();
                    while (i < size4) {
                        if (((oq) otVar.l.get(i)).o) {
                            i++;
                        }
                    }
                    ((ot) this.b).j.o(((oq) this.a).h);
                    return;
                }
                ((ot) this.b).m.post(this);
                return;
            case 8:
                ((ua) this.a).a = this.b;
                return;
            case 9:
                ((Application) this.a).unregisterActivityLifecycleCallbacks(this.b);
                return;
            case 10:
                try {
                    if (ub.d != null) {
                        ub.d.invoke(this.a, this.b, false, "AppCompat recreation");
                        return;
                    } else {
                        ub.e.invoke(this.a, this.b, false);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 11:
                ((vj) this.b).a((Typeface) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.b;
                Object obj6 = this.a;
                Object obj7 = ((aqq) obj5).a;
                if (obj7 == null) {
                    return;
                }
                ((vj) obj7).a((Typeface) obj6);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.a(this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                adv advVar = (adv) this.b;
                advVar.e = (opu) this.a;
                advVar.a();
                return;
            case 15:
                Object obj8 = this.b;
                Throwable th2 = (Throwable) this.a;
                Log.e("FragmentStrictMode", oll.a("Policy violation with PENALTY_DEATH in ", obj8), th2);
                throw th2;
            case 16:
                Object obj9 = this.a;
                Object obj10 = this.b;
                ahe aheVar = (ahe) obj9;
                if (aheVar.f()) {
                    aheVar.c();
                } else {
                    aheVar.b(obj10);
                }
                aheVar.f = 3;
                return;
            case 17:
                if (((ayo) this.a).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.b.run();
                    return;
                } catch (Throwable th3) {
                    if (!Log.isLoggable("GlideExecutor", 6)) {
                        return;
                    }
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                    return;
                }
            case 18:
                bbk.a().b();
                ((bdg) ((bdf) this.b).b).b = true;
                ((View) ((bdf) this.b).a).getViewTreeObserver().removeOnDrawListener(this.a);
                ((bdg) ((bdf) this.b).b).a.clear();
                return;
            case 19:
                ((alc) this.a).fG(((dee) this.b).a, false);
                return;
            default:
                Object obj11 = this.a;
                Object obj12 = this.b;
                guu aX = ((CommonPreferenceFragment) obj11).aX();
                duf dufVar = new duf();
                dufVar.d = ((dxs) obj12).a;
                aX.w(dufVar, ((an) obj11).fT().getString(R.string.f166030_resource_name_obfuscated_res_0x7f1408ad));
                return;
        }
    }
}
