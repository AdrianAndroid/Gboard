package defpackage;

import android.content.res.Resources;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: esj  reason: default package */
/* loaded from: classes.dex */
public final class esj implements eqs {
    private final Resources a;
    private final eri b;
    private final /* synthetic */ int c;

    public esj(Resources resources, eri eriVar, int i) {
        this.c = i;
        this.a = resources;
        this.b = eriVar;
    }

    @Override // defpackage.eqs
    public final /* synthetic */ eqr a(SparseArray sparseArray) {
        if (this.c == 0) {
            esq b = esq.b(this.a, this.b, euu.IMAGE_REF, euu.IMAGE_GRAVITY, euu.IMAGE_SCALE_MODE, euu.IMAGE_TILE_MODE, euu.IMAGE_BLUR_MODE, euu.IMAGE_BLUR_RADIUS, euu.IMAGE_WIDTH, euu.IMAGE_HEIGHT, sparseArray);
            if (b == null) {
                return null;
            }
            return new esk(b);
        }
        esq b2 = esq.b(this.a, this.b, euu.BACKGROUND_IMAGE_REF, euu.BACKGROUND_IMAGE_GRAVITY, euu.BACKGROUND_IMAGE_SCALE_MODE, euu.BACKGROUND_IMAGE_TILE_MODE, euu.BACKGROUND_IMAGE_BLUR_MODE, euu.BACKGROUND_IMAGE_BLUR_RADIUS, euu.BACKGROUND_IMAGE_WIDTH, euu.BACKGROUND_IMAGE_HEIGHT, sparseArray);
        if (b2 == null) {
            return null;
        }
        return new esd(b2);
    }
}
