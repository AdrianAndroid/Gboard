package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements Comparable, Serializable {
    private final long a;
    private final LocalDateTime b;
    private final ZoneOffset c;
    private final ZoneOffset d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = localDateTime.v(zoneOffset);
        this.b = localDateTime;
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    public final LocalDateTime a() {
        return this.b.t(this.d.k() - this.c.k());
    }

    public final LocalDateTime b() {
        return this.b;
    }

    public final Duration c() {
        return Duration.ofSeconds(this.d.k() - this.c.k());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (this.a > ((a) obj).a ? 1 : (this.a == ((a) obj).a ? 0 : -1));
    }

    public final ZoneOffset d() {
        return this.d;
    }

    public final ZoneOffset e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.c.equals(aVar.c) && this.d.equals(aVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        if (g()) {
            return Collections.emptyList();
        }
        Object[] objArr = {this.c, this.d};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(Objects.requireNonNull(objArr[i]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean g() {
        return this.d.k() > this.c.k();
    }

    public final long h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(g() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
