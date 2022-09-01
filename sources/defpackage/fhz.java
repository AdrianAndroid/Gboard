package defpackage;

/* compiled from: PG */
/* renamed from: fhz  reason: default package */
/* loaded from: classes.dex */
public enum fhz implements nfp {
    UNKNOWN_DONT_SEND(0),
    TYPING(1),
    CURSOR_CHANGE(2),
    APPLICATION_CONSUMED_CONTENT(3),
    FIELD_CHANGE(4),
    NEW_ORATION_STARTED(5),
    KEYBOARD_ACTION(6),
    INPUT_LANGUAGE_CHANGE(7),
    CANDIDATE_SELECTED(8),
    KEYBOARD_CLOSED(9),
    ORATION_COMPLETED(10),
    ORATION_RPC_ERROR(11),
    DELETE_KEY_PRESSED(12),
    UNRECOGNIZED(-1);
    
    private final int o;

    fhz(int i) {
        this.o = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
