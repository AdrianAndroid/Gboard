package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ggz  reason: default package */
/* loaded from: classes.dex */
public enum ggz implements nfp {
    USER_DICTIONARY_COMMAND_SUCCESS(1),
    UNKNOWN_ERROR(2),
    UNKNOWN_COMMAND(3),
    INVALID_ARGUMENT(4),
    UNKNOWN_SESSION_ID(5),
    FILE_NOT_FOUND(6),
    INVALID_FILE_FORMAT(7),
    FILE_SIZE_LIMIT_EXCEEDED(8),
    DICTIONARY_SIZE_LIMIT_EXCEEDED(9),
    ENTRY_SIZE_LIMIT_EXCEEDED(10),
    UNKNOWN_DICTIONARY_ID(11),
    ENTRY_INDEX_OUT_OF_RANGE(12),
    DICTIONARY_NAME_EMPTY(13),
    DICTIONARY_NAME_TOO_LONG(14),
    DICTIONARY_NAME_CONTAINS_INVALID_CHARACTER(15),
    DICTIONARY_NAME_DUPLICATED(16),
    READING_EMPTY(17),
    READING_TOO_LONG(18),
    READING_CONTAINS_INVALID_CHARACTER(19),
    WORD_EMPTY(20),
    WORD_TOO_LONG(21),
    WORD_CONTAINS_INVALID_CHARACTER(22),
    INVALID_POS_TYPE(23),
    COMMENT_TOO_LONG(24),
    COMMENT_CONTAINS_INVALID_CHARACTER(25),
    IMPORT_TOO_MANY_WORDS(26),
    IMPORT_INVALID_ENTRIES(27),
    NO_UNDO_HISTORY(28);
    
    private final int C;

    ggz(int i) {
        this.C = i;
    }

    public static ggz b(int i) {
        switch (i) {
            case 1:
                return USER_DICTIONARY_COMMAND_SUCCESS;
            case 2:
                return UNKNOWN_ERROR;
            case 3:
                return UNKNOWN_COMMAND;
            case 4:
                return INVALID_ARGUMENT;
            case 5:
                return UNKNOWN_SESSION_ID;
            case 6:
                return FILE_NOT_FOUND;
            case 7:
                return INVALID_FILE_FORMAT;
            case 8:
                return FILE_SIZE_LIMIT_EXCEEDED;
            case 9:
                return DICTIONARY_SIZE_LIMIT_EXCEEDED;
            case 10:
                return ENTRY_SIZE_LIMIT_EXCEEDED;
            case 11:
                return UNKNOWN_DICTIONARY_ID;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ENTRY_INDEX_OUT_OF_RANGE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return DICTIONARY_NAME_EMPTY;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return DICTIONARY_NAME_TOO_LONG;
            case 15:
                return DICTIONARY_NAME_CONTAINS_INVALID_CHARACTER;
            case 16:
                return DICTIONARY_NAME_DUPLICATED;
            case 17:
                return READING_EMPTY;
            case 18:
                return READING_TOO_LONG;
            case 19:
                return READING_CONTAINS_INVALID_CHARACTER;
            case 20:
                return WORD_EMPTY;
            case 21:
                return WORD_TOO_LONG;
            case 22:
                return WORD_CONTAINS_INVALID_CHARACTER;
            case 23:
                return INVALID_POS_TYPE;
            case 24:
                return COMMENT_TOO_LONG;
            case 25:
                return COMMENT_CONTAINS_INVALID_CHARACTER;
            case 26:
                return IMPORT_TOO_MANY_WORDS;
            case 27:
                return IMPORT_INVALID_ENTRIES;
            case 28:
                return NO_UNDO_HISTORY;
            default:
                return null;
        }
    }

    public static nfq c() {
        return ggq.l;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.C;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.C);
    }
}
