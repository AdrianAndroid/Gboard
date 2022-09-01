package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lqe  reason: default package */
/* loaded from: classes.dex */
public final class lqe extends lsn {
    public lqe(Iterator it) {
        super(it);
    }

    @Override // defpackage.lsn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
