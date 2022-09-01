package defpackage;

import com.google.android.apps.inputmethod.libs.search.expressiveconcepts.BlocklistManager;
import j$.util.Objects;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: ebs  reason: default package */
/* loaded from: classes.dex */
public final class ebs implements AutoCloseable, ebz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager");
    public static final lfy b = lfy.c(' ').b().h();
    public static final Comparator c = Collections.reverseOrder(xr.k);
    static final hhl d = hhq.a("emotion_model_suppress_neutral_response", true);
    static final hhl e = hhq.e("emotion_model_triggering_threshold", 0.05d);
    public final BlocklistManager g;
    public ebu i;
    public final Object h = new Object();
    public final mks f = gxo.c(9);

    public ebs() {
        BlocklistManager blocklistManager = new BlocklistManager();
        BlocklistManager.a.e(blocklistManager.d);
        this.g = blocklistManager;
    }

    @Override // defpackage.ebz
    public final llp a(String str, int i) {
        throw null;
    }

    public final String b() {
        String language;
        synchronized (this.h) {
            ebu ebuVar = this.i;
            language = ebuVar != null ? ebuVar.d.getLanguage() : null;
        }
        return language;
    }

    @Override // defpackage.ebz
    public final boolean c() {
        boolean z;
        synchronized (this.h) {
            z = this.i != null;
        }
        return z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            ebu ebuVar = this.i;
            if (ebuVar != null) {
                mks mksVar = this.f;
                Objects.requireNonNull(ebuVar);
                mksVar.execute(new eas(ebuVar, 5));
                this.i = null;
            }
        }
    }
}
