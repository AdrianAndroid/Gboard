package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: kru  reason: default package */
/* loaded from: classes.dex */
public final class kru extends Property {
    private final Matrix a = new Matrix();

    public kru() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        this.a.set(((ImageView) obj).getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
