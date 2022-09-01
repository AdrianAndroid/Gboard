package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: dmq  reason: default package */
/* loaded from: classes.dex */
public abstract class dmq extends mo implements View.OnTouchListener {
    private final dms s;

    public dmq(View view, dms dmsVar) {
        super(view);
        this.s = dmsVar;
        view.setOnClickListener(dmsVar);
    }

    public abstract void F();

    public abstract void G();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.s.f || motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.s.h.p(this);
        return false;
    }
}
