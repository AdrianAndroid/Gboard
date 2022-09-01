package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* renamed from: ev  reason: default package */
/* loaded from: classes.dex */
class ev extends es {
    int[][] K;

    public ev(ev evVar, ew ewVar, Resources resources) {
        super(evVar, ewVar, resources);
        if (evVar != null) {
            this.K = evVar.K;
        } else {
            this.K = new int[this.i.length];
        }
    }

    @Override // defpackage.es
    public void d() {
        int length = this.K.length;
        int[][] iArr = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                this.K = iArr;
                return;
            } else {
                int[] iArr2 = this.K[length];
                iArr[length] = iArr2 != null ? (int[]) iArr2.clone() : null;
            }
        }
    }

    @Override // defpackage.es
    public final void j(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        Drawable[] drawableArr2 = this.i;
        if (drawableArr2 != null) {
            System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
        }
        this.i = drawableArr;
        int[][] iArr = new int[i2];
        System.arraycopy(this.K, 0, iArr, 0, i);
        this.K = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(int[] iArr) {
        int[][] iArr2 = this.K;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new ew(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new ew(this, resources);
    }
}
