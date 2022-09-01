package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* renamed from: fcd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fcd implements hla {
    private final /* synthetic */ int d;
    public static final /* synthetic */ fcd c = new fcd(2);
    public static final /* synthetic */ fcd b = new fcd(1);
    public static final /* synthetic */ fcd a = new fcd(0);

    private /* synthetic */ fcd(int i) {
        this.d = i;
    }

    @Override // defpackage.hla
    public final void a(Animator animator, View view) {
        int i = this.d;
        if (i == 0) {
            fdz.c(animator, view);
        } else if (i != 1) {
            fdz.c(animator, view);
        } else {
            fdz.c(animator, view);
        }
    }
}
