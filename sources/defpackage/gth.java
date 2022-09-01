package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: gth  reason: default package */
/* loaded from: classes.dex */
public final class gth {
    private final Context a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private gtg f;
    private gtg g;
    private boolean h;

    public gth(Context context, AttributeSet attributeSet) {
        Throwable th;
        TypedArray typedArray;
        this.a = context;
        boolean z = false;
        if (attributeSet != null) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, gtn.b, 0, 0);
                try {
                    this.b = typedArray.getResourceId(0, 0);
                    this.c = typedArray.getResourceId(2, 0);
                    int resourceId = typedArray.getResourceId(1, 0);
                    this.d = resourceId;
                    this.e = typedArray.getResourceId(3, 0);
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    this.h = resourceId != 0 ? true : z;
                } catch (Throwable th2) {
                    th = th2;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                typedArray = null;
            }
        } else {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
        }
    }

    public final gtg a(boolean z) {
        if (!z || !this.h) {
            if (this.f == null) {
                this.f = new gtg(this.a, this.b, this.c);
            }
            return this.f;
        }
        if (this.g == null) {
            this.g = new gtg(this.a, this.d, this.e);
        }
        return this.g;
    }
}
