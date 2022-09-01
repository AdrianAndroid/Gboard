package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* renamed from: ajq  reason: default package */
/* loaded from: classes.dex */
public final class ajq {
    public final List a;
    public final List b;
    public final List c;

    public ajq(Collection collection, Collection collection2) {
        this.c = collection == null ? Collections.emptyList() : new ArrayList(collection);
        this.b = new ArrayList(collection2);
        this.a = Collections.emptyList();
    }
}
