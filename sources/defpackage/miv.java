package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: miv  reason: default package */
/* loaded from: classes.dex */
final class miv extends mit {
    @Override // defpackage.mit
    public final int a(miw miwVar) {
        int i;
        synchronized (miwVar) {
            i = miwVar.remaining - 1;
            miwVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.mit
    public final void b(miw miwVar, Set set) {
        synchronized (miwVar) {
            if (miwVar.seenExceptions == null) {
                miwVar.seenExceptions = set;
            }
        }
    }
}
