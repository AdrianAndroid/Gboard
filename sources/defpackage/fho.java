package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fho  reason: default package */
/* loaded from: classes.dex */
public enum fho implements nfp {
    UNKNOWN(0),
    DONE(1),
    GO(2),
    NEXT(3),
    PREVIOUS(4),
    SEARCH(5),
    SEND(6),
    DELETE_CURRENT_ORATION(7),
    DELETE_LAST_SENTENCE(8),
    DELETE_LAST_WORD(9),
    DELETE_ALL(10),
    DELETE_SELECTION(13),
    UNDO(14),
    DELETE_LAST_WORD_OR_PUNCTUATION(15),
    READ_BACK(16),
    UNRECOGNIZED(-1);
    
    private final int q;

    fho(int i) {
        this.q = i;
    }

    public static fho b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DONE;
            case 2:
                return GO;
            case 3:
                return NEXT;
            case 4:
                return PREVIOUS;
            case 5:
                return SEARCH;
            case 6:
                return SEND;
            case 7:
                return DELETE_CURRENT_ORATION;
            case 8:
                return DELETE_LAST_SENTENCE;
            case 9:
                return DELETE_LAST_WORD;
            case 10:
                return DELETE_ALL;
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return DELETE_SELECTION;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return UNDO;
            case 15:
                return DELETE_LAST_WORD_OR_PUNCTUATION;
            case 16:
                return READ_BACK;
        }
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
