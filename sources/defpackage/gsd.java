package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.trainingcache.ekho.LearningController;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* renamed from: gsd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gsd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public gsd() {
    }

    public gsd(SearchKeyboard searchKeyboard, Context context) {
        this.b = searchKeyboard;
        this.a = context;
    }

    public /* synthetic */ gsd(InAppTrainingServiceImpl inAppTrainingServiceImpl, fxa fxaVar, byte[] bArr, byte[] bArr2) {
        this.a = inAppTrainingServiceImpl;
        this.b = fxaVar;
    }

    public gsd(ewe eweVar, LearningController learningController) {
        this.a = eweVar;
        this.b = learningController;
    }

    public gsd(fow fowVar, Dialog dialog) {
        this.b = fowVar;
        this.a = dialog;
    }

    public gsd(gsa gsaVar, grz grzVar) {
        this.a = gsaVar;
        this.b = grzVar;
    }

    public /* synthetic */ gsd(gsh gshVar, View view) {
        this.a = gshVar;
        this.b = view;
    }

    public final boolean a(MotionEvent motionEvent) {
        Object obj = this.a;
        Object obj2 = this.b;
        gsh gshVar = (gsh) obj;
        if (gshVar.i == null) {
            return false;
        }
        Rect rect = new Rect();
        jdy.i((View) obj2, gshVar.i, rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final jog b(String str, ndy ndyVar, nem nemVar, mfx mfxVar, String str2, mzg mzgVar) {
        Object obj = this.a;
        Object obj2 = this.b;
        InAppTrainingServiceImpl inAppTrainingServiceImpl = (InAppTrainingServiceImpl) obj;
        Context a = inAppTrainingServiceImpl.h.a();
        jns jnsVar = InAppTrainingServiceImpl.a;
        fwe fweVar = inAppTrainingServiceImpl.i;
        return new gcf(a, jnsVar, fweVar, inAppTrainingServiceImpl.g, inAppTrainingServiceImpl.j, str, ndyVar, nemVar, mfxVar, fweVar.ag() ? ((fxa) obj2).h(str, ndyVar) : null, str2, mzgVar, null);
    }

    public final void c() {
        ((fow) this.b).a.b();
        if (((Dialog) this.a).isShowing()) {
            ((Dialog) this.a).dismiss();
        }
    }
}
