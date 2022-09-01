package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dbh  reason: default package */
/* loaded from: classes.dex */
public final class dbh implements View.OnLongClickListener {
    private final View.OnLongClickListener a;

    public dbh(View.OnLongClickListener onLongClickListener) {
        this.a = onLongClickListener;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        hxk.a(view.getContext()).b(view, 2);
        View.OnLongClickListener onLongClickListener = this.a;
        return onLongClickListener != null && onLongClickListener.onLongClick(view);
    }
}
