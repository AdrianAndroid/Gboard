package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lqd  reason: default package */
/* loaded from: classes.dex */
public final class lqd extends lsn {
    public lqd(Iterator it) {
        super(it);
    }

    @Override // defpackage.lsn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }
}
