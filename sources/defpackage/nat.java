package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nat  reason: default package */
/* loaded from: classes2.dex */
public final class nat implements nap {
    private final nas a;
    private final List b;

    public nat(nas nasVar, List list) {
        oll.e(nasVar, "function");
        this.a = nasVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nat)) {
            return false;
        }
        nat natVar = (nat) obj;
        return this.a == natVar.a && oll.g(this.b, natVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nas nasVar = this.a;
        List list = this.b;
        return "FunctionCall(function=" + nasVar + ", arguments=" + list + ")";
    }
}
