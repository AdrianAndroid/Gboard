package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: grv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class grv implements gqg {
    private final /* synthetic */ int c;
    public static final /* synthetic */ grv b = new grv(1);
    public static final /* synthetic */ grv a = new grv(0);

    private /* synthetic */ grv(int i) {
        this.c = i;
    }

    @Override // defpackage.gqg
    public final void a(View view) {
        if (this.c == 0) {
            ((ViewGroup) view).dispatchSetActivated(true);
        } else {
            ((ViewGroup) view).dispatchSetActivated(false);
        }
    }
}
