package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjk  reason: default package */
/* loaded from: classes.dex */
public final class bjk implements Cloneable {
    public bid a = bid.a();
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public bhb f;
    public bhb g;
    public boolean h;
    public boolean i;

    public bjk() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object clone() {
        try {
            bjk bjkVar = (bjk) super.clone();
            bjkVar.a = (bid) this.a.clone();
            bjkVar.d = new Paint(this.d);
            bjkVar.e = new Paint(this.e);
            return bjkVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
