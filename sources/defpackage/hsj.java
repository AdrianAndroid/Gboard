package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* renamed from: hsj  reason: default package */
/* loaded from: classes.dex */
public final class hsj implements gzb {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public qq b;
    public hpx c;
    public CursorAnchorInfo d;
    public boolean e;

    private final void b() {
        if (this.e) {
            this.e = false;
            hpx hpxVar = this.c;
            if (hpxVar != null) {
                hpxVar.v(false, false);
            }
        }
        this.d = null;
    }

    public final void a(hpx hpxVar) {
        b();
        this.c = hpxVar;
        if (hpxVar != null) {
            boolean z = !this.a.isEmpty();
            this.e = z;
            qq qqVar = this.b;
            boolean z2 = false;
            if (qqVar != null && !qqVar.isEmpty()) {
                z2 = true;
            }
            if (!z && !z2) {
                return;
            }
            hpxVar.v(z, true);
        }
    }

    @Override // defpackage.gzb
    public final void aM(gza gzaVar) {
        if (!this.a.remove(gzaVar) || !this.a.isEmpty()) {
            return;
        }
        b();
    }

    @Override // defpackage.gzb
    public final void aO(gza gzaVar) {
        throw null;
    }

    @Override // defpackage.gzb
    public final void af(gza gzaVar) {
        this.a.add(gzaVar);
        hpx hpxVar = this.c;
        if (hpxVar != null) {
            if (!this.e) {
                this.e = true;
                hpxVar.v(true, true);
                return;
            }
            CursorAnchorInfo cursorAnchorInfo = this.d;
            if (cursorAnchorInfo == null) {
                return;
            }
            gzaVar.a(cursorAnchorInfo);
        }
    }
}
