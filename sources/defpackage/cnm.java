package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.inputmethod.libs.expression.candidatesupplier.MultipleImageCandidatePopupView;
import j$.util.function.Function;

/* compiled from: PG */
/* renamed from: cnm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cnm implements his {
    public final /* synthetic */ View a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cnm(Function function, View view, int i) {
        this.c = i;
        this.b = function;
        this.a = view;
    }

    public /* synthetic */ cnm(leq leqVar, View view, int i) {
        this.c = i;
        this.b = leqVar;
        this.a = view;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.function.Function, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.his
    public final void a(Object obj, Object obj2) {
        if (this.c == 0) {
            ?? r0 = this.b;
            View view = this.a;
            Integer num = (Integer) obj2;
            Interpolator interpolator = cny.a;
            ((View.OnClickListener) r0.apply((cjo) obj)).onClick(view);
            return;
        }
        ?? r02 = this.b;
        View view2 = this.a;
        Integer num2 = (Integer) obj2;
        int i = MultipleImageCandidatePopupView.e;
        r02.a((cjo) obj).onClick(view2);
    }
}
